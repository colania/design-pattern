package org.example.pipline;

/**
 * @description:生命周期
 * @author：wwei
 * @date: 2022/12/28
 */
public interface LifeCycle {
    /**
     *  初始化
     * @param config
     */
    void init(String config);

    /**
     *  启动
     */
    void startup();

    /**
     *  结束
     */
    void shutdown();
}
