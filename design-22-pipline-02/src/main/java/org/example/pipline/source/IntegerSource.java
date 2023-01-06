package org.example.pipline.source;

import org.example.pipline.Component;
import org.example.pipline.channel.IncrChannel;

import java.util.Collection;
import java.util.Collections;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/28
 */
public class IntegerSource extends Source<Integer, Integer> {
    private int val = 0;

    @Override
    protected Integer doExecute(Integer o) {
        return o;
    }

    @Override
    public void init(String config) {
        System.out.println("--------- " + getName() + " init --------- ");
        val = 1;
    }

    @Override
    public void startup() {
        super.startup();
        execute(val);
    }

    @Override
    public String getName() {
        return "Integer-Source";
    }

    @Override
    public Collection<Component> getDownStrems() {
        return Collections.singletonList(new IncrChannel());
    }
}
