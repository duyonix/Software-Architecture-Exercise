import java.util.HashMap;
import java.util.Map;

public class SObjectManager {
    private static final Map<Integer, SObject> objects = new HashMap<>();
    private static int NextAvailableHandle = 1;
    public static void RegisterObject(SObject sObject) {
        sObject.setHandle(NextAvailableHandle);
        objects.put(sObject.getHandle(), sObject);
        NextAvailableHandle++;
    }

    public static String GetAttributeValue(int handle, String attributeName) {
        if(CheckObject(handle)) {
            SObject obj = FindObjectByHandle(handle);
            return obj.GetAttributeValue(attributeName);
        }
        return "";
    }

    public static boolean SetAttributeValue(int handle, String attributeName, String attributeValue) {
        if(CheckObject(handle)) {
            SObject obj = FindObjectByHandle(handle);
            return obj.SetAttributeValue(attributeName, attributeValue);
        }
        return false;
    }

    public static String ExecuteMethod(int handle, String methodName, String parameters) {
        if(CheckObject(handle)) {
            SObject obj = FindObjectByHandle(handle);
            return obj.ExecuteMethod(methodName, parameters);
        }
        return "";
    }

    private static SObject FindObjectByHandle(int handle) {
        return objects.get(handle);
    }

    private static boolean CheckObject(int handle) {
        return objects.containsKey(handle);
    }

    public static int CreateObject(String remoteType) {
        switch(remoteType) {
            case "SFraction" -> {
                return new SFraction().getHandle();
            }
            case "SStudent" -> {
                return new SStudent().getHandle();
            }
            default -> {
                return 0;
            }
        }
    }
}
