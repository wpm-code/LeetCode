package design.singleton;

/**
 * 懒汉式单例设计模式
 */
public class Singleton01 {
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
class LazySingleton{
    private static LazySingleton singleton;
    private LazySingleton() {}
    public static synchronized LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}