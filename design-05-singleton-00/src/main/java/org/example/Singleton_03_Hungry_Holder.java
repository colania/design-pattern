package org.example;

/**
 * @description:
 * 使⽤类的静态内部类实现的单例模式，既保证了线程安全有保证了懒加载，同时不会因为加锁的⽅式耗费性能
 * JVM虚拟机可以保证多线程并发访问的正确性，也就是⼀个类的构造⽅法在多线程环 境下可以被正确的加载。
 *
 * @author：wwei
 * @date: 2022/12/25
 */
public class Singleton_03_Hungry_Holder {
    private static class SingletonHolder{
        private static Singleton_03_Hungry_Holder instance = new Singleton_03_Hungry_Holder();
    }

    public Singleton_03_Hungry_Holder() {
    }
    public static Singleton_03_Hungry_Holder getInstance() {
        return SingletonHolder.instance;
    }
}
