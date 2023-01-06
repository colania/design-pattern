package org.example;

/**
 * @description:双重锁的⽅式是⽅法级锁的优化，减少了部分获取实例的耗时。
 * @author：wwei
 * @date: 2022/12/25
 */
public class Singleton_04_Double_Check {
    private static volatile Singleton_04_Double_Check instance;

    public Singleton_04_Double_Check() {
    }

    public static Singleton_04_Double_Check getInstance() {
        if (null != instance) return instance;
        synchronized (Singleton_04_Double_Check.class) {
            if (null == instance) {
                instance = new Singleton_04_Double_Check();
            }
        }
        return instance;
    }
}
