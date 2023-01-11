import java.util.ArrayList;
import java.util.List;

public class Article  {
    private int id;
    private static int NextAvailableID = 1;
    public String content;
    public List<String> keywords = new ArrayList<>();

    public Article(String content, ArrayList<String> keywords) {
        this.id = Article.NextAvailableID++;
        this.content = content;
        this.keywords = keywords;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
