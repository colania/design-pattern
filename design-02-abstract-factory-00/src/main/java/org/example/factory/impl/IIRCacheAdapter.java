package org.example.factory.impl;

import org.example.factory.ICacheAdapter;
import org.example.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/21
 */
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
