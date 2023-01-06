package org.example.pipline;

import java.util.Collection;

/**
 * @description:组件
 * @author：wwei
 * @date: 2022/12/28
 */
public interface Component<T> extends LifeCycle {
    /**
     *  组件名称
     * @return
     */
    String getName();

    /**
     *  获取下游组件
     * @return
     */
    Collection<Component> getDownStrems();

    /**
     *  执行
     */
    void execute(T o);
}
