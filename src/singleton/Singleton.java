package singleton;

public class Singleton {
    private String var = "teste";
    private static Singleton singleton = new Singleton();

    public void doSomething() {
        System.out.println(var);
    }
    public String getSomething() {
        return var;
    }

    public static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {
    }
}
