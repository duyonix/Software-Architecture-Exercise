public class Singleton {
    private static final int nMaxInstances = 1;
    private static int nCount = 0;

    private Singleton() {
        nCount++;
    }

    public static Singleton Build() {
        if (CanBuild()) {
            nCount++;
            return new Singleton();
        }
        return null;
    }

    private static boolean CanBuild() {
        return nCount < nMaxInstances;
    }

}
