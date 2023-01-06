package org.example;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/25
 */
public class Singleton_05_AtomicReference {

    private static final AtomicReference<Singleton_05_AtomicReference> INSTANCE =new AtomicReference<>();
    private static Singleton_05_AtomicReference instance ;

    public Singleton_05_AtomicReference() {
    }

    public static final Singleton_05_AtomicReference getInstance(){
        for (; ; ) {
            Singleton_05_AtomicReference instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_05_AtomicReference());
            return INSTANCE.get();
        }
    }
}
