package org.example.factory.impl;

import org.example.factory.ICacheAdapter;
import org.example.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/21
 */
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
