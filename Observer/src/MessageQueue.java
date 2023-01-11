import java.util.ArrayList;
import java.util.List;

public class MessageQueue {
    private List<Member> members = new ArrayList<>();
    private List<Article> articles = new ArrayList<>();
    private NewsChannel Owner;

    public MessageQueue(NewsChannel newsChannel) {
        this.Owner = newsChannel;
    }

    public void Queue(Member member, Article article) {
        members.add(member);
        articles.add(article);
    }

    public boolean IsReady() {
        return members.size() >= 2;
    }

    public void Notify() {
        for (int i = 0; i < members.size(); i++) {
            members.get(i).Notify(this.Owner, articles.get(i));
        }
        members.clear();
        articles.clear();
    }
}
