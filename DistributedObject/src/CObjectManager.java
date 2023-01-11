public class CObjectManager {
    public static String GetAttributeValue(int handle, String attributeName) {
        return SObjectManager.GetAttributeValue(handle, attributeName);
    }

    public static boolean SetAttributeValue(int handle, String attributeName, String attributeValueAsString) {
        return SObjectManager.SetAttributeValue(handle, attributeName, attributeValueAsString);
    }

    public static int CreateRemoteObject(String remoteType) {
        return SObjectManager.CreateObject(remoteType);
    }
}
