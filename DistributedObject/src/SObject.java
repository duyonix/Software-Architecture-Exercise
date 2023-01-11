public class SObject {
    protected int handle;

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    public SObject() {
        SObjectManager.RegisterObject(this);
    }

    public String GetAttributeValue(String attributeName) {
        return "";
    }

    public boolean SetAttributeValue(String attributeName, String attributeValue) {
        return true;
    }

    public String ExecuteMethod(String methodName, String parameters) {
        return "";
    }
}
