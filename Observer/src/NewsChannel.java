import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsChannel {
    public String name;
    protected Map<Integer, Article> articles = new HashMap<>();
    protected Map<Integer, Member> subscribers = new HashMap<>();
    protected  Map<Integer, List<String>> preferences = new HashMap<>();

    public NewsChannel(String name) {
        this.name = name;
    }

    private boolean IsMember(Member author) {
        return subscribers.containsKey(author.getId());
    }

    public boolean Subscribe(Member member, List<String> keywords) {
        if (IsMember(member)) {
            return false;
        }
        subscribers.put(member.getId(), member);
        preferences.put(member.getId(), keywords);
        return true;
    }

    public boolean Unsubscribe(Member member) {
        if (!IsMember(member)) {
            return false;
        }
        subscribers.remove(member.getId());
        preferences.remove(member.getId());
        return true;
    }

    public boolean PostArticle(Article article, Member author) {
        if (!IsMember(author)) {
            return false;
        }
        articles.put(article.getId(), article);
        NotifyAll(article);
        return true;
    }

    private final ContentChecker contentChecker = new DefaultContentChecker();
    private void NotifyAll(Article article) {
        for (Member member : subscribers.values()) {
            if (contentChecker.IsAppropriate(article, member, preferences.get(member.getId()))) {
//                member.Notify(this, article);
                EnqueueNotification(member, article);
            }
        }
    }

    MessageQueue mq = new MessageQueue(this);
    private void EnqueueNotification(Member member, Article article) {
        mq.Queue(member, article);
        if(mq.IsReady()) {
            mq.Notify();
        }

    }
}
