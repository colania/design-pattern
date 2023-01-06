package org.example.strategy.impl;

import org.example.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/28
 */
public class NYGCouponDiscount implements ICouponDiscount<Double>  {
    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
