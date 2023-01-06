package org.example.pipline.sink;

import org.example.pipline.Component;

import java.util.Collection;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/28
 */
public class ConsoleSink extends Sink<String, Void> {
    @Override
    protected Void doExecute(String o) {
        return null;
    }

    @Override
    public String getName() {
        return "Console-Sink";
    }

    @Override
    public Collection<Component> getDownStrems() {
        return null;
    }

    @Override
    public void init(String config) {

    }
}
