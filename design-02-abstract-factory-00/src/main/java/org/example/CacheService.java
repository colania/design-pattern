package org.example;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/21
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);
    void del(String key);
}
