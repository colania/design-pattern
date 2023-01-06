package org.example;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/25
 */
public class Singleton_02_Lazy_Unsafe {

    private static Singleton_02_Lazy_Unsafe instance;

    public Singleton_02_Lazy_Unsafe() {
    }

    public static Singleton_02_Lazy_Unsafe getInstance() {
        if (null != instance) return instance;
        instance = new Singleton_02_Lazy_Unsafe();
        return instance;
    }
}
