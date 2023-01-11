import java.util.HashMap;

public class MyObject {
    protected HashMap<String, Object> attributes = new HashMap<String, Object>();
    protected int ID;
    private boolean bAutoAddNew = true;

    public MyObject() {
        MyObject.Register(this);
    }

    public MyObject(String type) {
        MyObject.Register(this);
        populateCommonAttributes(type);
    }

    private void populateCommonAttributes(String type) {
        AttributeManager.PopulateCommonAttributes(this, type);
    }

    private static final HashMap<Integer, MyObject> objects = new HashMap<Integer, MyObject>();
    private static int NextAvailableID = 1;

    private static void Register(MyObject obj) {
        objects.put(NextAvailableID, obj);
        obj.ID = NextAvailableID++;
    }

    public Object getAttributeValue(String name) {
        if (attributes.containsKey(name)) {
            return attributes.get(name);
        }
        return null;
    }

    public boolean setAttributeValue(String name, Object value) {
        if (attributes.containsKey(name) || bAutoAddNew) {
            attributes.put(name, value);
            return true;
        }
        return false;
    }

    public Object get(String name) {
        return getAttributeValue(name);
    }

    public boolean set(String name, Object value) {
        return setAttributeValue(name, value);
    }
}
