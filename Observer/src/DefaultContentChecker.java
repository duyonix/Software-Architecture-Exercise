import java.util.List;

public class DefaultContentChecker extends ContentChecker {
    @Override
    public boolean IsAppropriate(Article article, Member member, List<String> preferences) {
        for (String preference : preferences) {
            for (String keyword : article.keywords) {
                if (preference.equals(keyword)) {
                    return true;
                }
            }
        }
        return false;
    }
}
