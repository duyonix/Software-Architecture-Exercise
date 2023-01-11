public class SFraction extends SObject {
    private int numerator;
    private int denominator;

    public boolean isGreaterThan(double value) {
        return (double)numerator / denominator > value;
    }

    public boolean isPositive() {
        return numerator * denominator > 0;
    }
    public void Normalize() {
        // dunno
    }

    @Override
    public String GetAttributeValue(String attributeName) {
        return switch (BestMatch(attributeName)) {
            case "numerator" -> Integer.toString(numerator);
            case "denominator" -> Integer.toString(denominator);
            default -> super.GetAttributeValue(attributeName);
        };
    }

    private String BestMatch(String attributeName) {
        return attributeName.toLowerCase();
    }

    @Override
    public boolean SetAttributeValue(String attributeName, String attributeValue) {
        switch (BestMatch(attributeName)) {
            case "numerator" -> {
                numerator = Integer.parseInt(attributeValue);
                return true;
            }
            case "denominator" -> {
                int value = Integer.parseInt(attributeValue);
                if (value != 0) {
                    denominator = value;
                    return true;
                }
                return false;
            }
        }
        return super.SetAttributeValue(attributeName, attributeValue);
    }

    @Override
    public String ExecuteMethod(String methodName, String parameters) {
        switch(BestMatch(methodName)) {
            case "isgreaterthan" -> {
                double value = Double.parseDouble(parameters);
                return Boolean.toString(isGreaterThan(value));
            }
            case "ispositive" -> {
                return Boolean.toString(isPositive());
            }
            case "normalize" -> {
                Normalize();
                return "";
            }
        }
        return super.ExecuteMethod(methodName, parameters);
    }
}
