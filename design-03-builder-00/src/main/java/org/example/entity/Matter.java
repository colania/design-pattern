package org.example.entity;

import java.math.BigDecimal;

/**
 * @description: 装修物料
 * @author：wwei
 * @date: 2022/12/21
 */
public interface Matter {

    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 平米报价
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();

}
