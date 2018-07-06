package singleton;

public class singleton {
    private static singleton ourInstance = new singleton();

    public static singleton getInstance() {
        return ourInstance;
    }

    private singleton() {
    }
}
