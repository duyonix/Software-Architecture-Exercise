public class Member {
    public String name;
    private int id;
    private static int NextAvailableID = 1;

    public Member(String name) {
        this.id = Member.NextAvailableID++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void Notify(NewsChannel newsChannel, Article article) {
        System.out.println("Member " + name + " was notified about article \"" + article.content + "\" from channel " + newsChannel.name);
    }
}
