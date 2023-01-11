public class Main {
    public static void main(String[] args) {
        CFraction fr1 = new CFraction();
        CFraction fr2 = new CFraction(1, 2);
        fr1.setNumerator(fr2.getDenominator() * 2);

        System.out.println("fr1 = " + fr1.getNumerator() + "/" + fr1.getDenominator());
        System.out.println("fr2 = " + fr2.getNumerator() + "/" + fr2.getDenominator());
    }
}