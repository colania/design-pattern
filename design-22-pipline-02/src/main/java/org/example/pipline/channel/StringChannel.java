package org.example.pipline.channel;

import org.example.pipline.Component;
import org.example.pipline.sink.ConsoleSink;

import java.util.Collection;
import java.util.Collections;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/28
 */
public class StringChannel extends Channel<Integer, String> {
    @Override
    protected String doExecute(Integer o) {
        return "str" + o;
    }

    @Override
    public String getName() {
        return "String-Channel";
    }

    @Override
    public Collection<Component> getDownStrems() {
        return Collections.singletonList(new ConsoleSink());
    }

    @Override
    public void init(String config) {

    }
}
