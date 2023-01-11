public class CFraction extends CObject {
    public CFraction() {
        this.handle = CObjectManager.CreateRemoteObject("SFraction");
        this.setNumerator(0);
        this.setDenominator(1);
    }

    public CFraction(int numerator, int denominator) {
        this.handle = CObjectManager.CreateRemoteObject("SFraction");
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public int getNumerator() {
        return Integer.parseInt(GetAttributeValue("numerator"));
    }

    public void setNumerator(int value) {
        SetAttributeValue("numerator", Integer.toString(value));
    }

    public int getDenominator() {
        return Integer.parseInt(GetAttributeValue("denominator"));
    }

    public void setDenominator(int value) {
        SetAttributeValue("denominator", Integer.toString(value));
    }
}
