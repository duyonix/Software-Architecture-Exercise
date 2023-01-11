public class CObject {
    protected int handle = 0;

    protected String GetAttributeValue(String attributeName) {
        return CObjectManager.GetAttributeValue(this.handle, attributeName);
    }

    protected boolean SetAttributeValue(String attributeName, String attributeValueAsString) {
        return CObjectManager.SetAttributeValue(this.handle, attributeName, attributeValueAsString);
    }
}
