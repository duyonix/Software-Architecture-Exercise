import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsChannel Classroom = new NewsChannel("Classroom");
        NewsChannel Scholarship = new NewsChannel("Scholarship");

        Member member1 = new Member("Yasuo");
        Member member2 = new Member("Riven");
        Member member3 = new Member("Zed");
        Member member4 = new Member("Jhin");

        Classroom.Subscribe(member1, new ArrayList <String>(List.of("Java", "C++", "C#")));
        Classroom.Subscribe(member3, new ArrayList <String>(List.of("Java", "Python", "Golang")));

        Article article1 = new Article("Java is a programming language", new ArrayList <String>(List.of("Java", "Programming", "Language")));
        Classroom.PostArticle(article1, member1);
    }
}