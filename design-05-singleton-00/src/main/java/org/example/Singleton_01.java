package org.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:静态类使⽤
 * @author：wwei
 * @date: 2022/12/25
 */
public class Singleton_01 {
    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();
}
