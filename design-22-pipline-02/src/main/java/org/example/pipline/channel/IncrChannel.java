package org.example.pipline.channel;

import org.example.pipline.Component;

import java.util.Collection;
import java.util.Collections;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/28
 */
public class IncrChannel extends Channel<Integer, Integer>{
    @Override
    protected Integer doExecute(Integer o) {
        return o + 1;
    }

    @Override
    public String getName() {
        return "Incr-Channel";
    }

    @Override
    public Collection<Component> getDownStrems() {
        return Collections.singletonList(new StringChannel());
    }

    @Override
    public void init(String config) {

    }
}
