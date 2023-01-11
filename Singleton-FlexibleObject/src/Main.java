public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton s1 = Singleton.Build();
        Singleton s2 = Singleton.Build();
        System.out.println(s1 != null ? "s1 has been created" : "s1 has not been created");
        System.out.println(s2 != null ? "s2 has been created" : "s2 has not been created");

        System.out.println();
        // Flexible Object
        MyObject fraction = new MyObject();
        fraction.set("numerator", 1);
        fraction.set("denominator", 2);
        System.out.println("Fraction: " + fraction.get("numerator") + "/" + fraction.get("denominator"));
    }
}