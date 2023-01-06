package org.example.pipline;

import org.example.pipline.source.Source;

/**
 *  流水线
 */
public class Pipline implements LifeCycle{
    /**
     *  数据源
     */
    private Source source;

    public Pipline(Source source) {
        this.source = source;
    }

    @Override
    public void init(String config) {
        // 初始化
        System.out.println("--------- Pipeline init --------- ");
        source.init(null);
    }

    @Override
    public void startup() {
        // 启动
        System.out.println("--------- Pipeline startup --------- ");
        source.startup();
    }

    @Override
    public void shutdown() {
        // 结束
        source.shutdown();
        System.out.println("--------- Pipeline shutdown --------- ");
    }
}
