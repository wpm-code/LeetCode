package design.singleton;

/**
 * 双端检查锁
 */
public class Singleton02 {
    public static void main(String[] args) {
        CheckSingleton singleton1 = CheckSingleton.getInstance();
        CheckSingleton singleton2 = CheckSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
class CheckSingleton{
    private static CheckSingleton singleton;
    private CheckSingleton() {}
    public static CheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (CheckSingleton.class) {
                if (singleton == null) {
                    singleton = new CheckSingleton();
                }
            }
        }
        return singleton;
    }
}