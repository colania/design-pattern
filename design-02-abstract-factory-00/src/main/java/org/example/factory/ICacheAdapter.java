package org.example.factory;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/21
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
