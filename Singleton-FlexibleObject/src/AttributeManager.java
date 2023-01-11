public class AttributeManager {
    public static boolean PopulateCommonAttributes(MyObject myObject, String type) {
        switch (type) {
            case "Fraction":
                myObject.set("numerator", 1);
                myObject.set("denominator", 2);
                return true;
            case "Student":
                myObject.set("name", "John Doe");
                myObject.set("age", 18);
                return true;
            default:
                return false;
        }
    }
}
