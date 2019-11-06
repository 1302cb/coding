package singleton;

/**
 * 属于懒汉式的一种,先去看看是否为空，如果为空，那么就先锁住类，再去判断如果为空就new一个对象
 */
public class DoubleLockSingleton {

    private static DoubleLockSingleton instance = null;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
