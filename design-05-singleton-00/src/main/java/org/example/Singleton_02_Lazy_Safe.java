package org.example;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/25
 */
public class Singleton_02_Lazy_Safe {

    private static Singleton_02_Lazy_Safe instance;

    public Singleton_02_Lazy_Safe() {
    }

    public static synchronized Singleton_02_Lazy_Safe getInstance() {
        if (null != instance) return instance;
        instance = new Singleton_02_Lazy_Safe();
        return instance;
    }
}
