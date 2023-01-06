package org.example;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/25
 */
public class Singleton_03_Hungry_Safe {
    private static Singleton_03_Hungry_Safe instance = new Singleton_03_Hungry_Safe();

    public Singleton_03_Hungry_Safe() {
    }

    public static Singleton_03_Hungry_Safe getInstance(){
        return instance;
    }
}
