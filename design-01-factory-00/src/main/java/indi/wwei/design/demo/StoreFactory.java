package indi.wwei.design.demo;

import indi.wwei.design.demo.store.ICommodity;
import indi.wwei.design.demo.store.impl.CardCommodityService;
import indi.wwei.design.demo.store.impl.CouponCommodityService;
import indi.wwei.design.demo.store.impl.GoodsCommodityService;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/21
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品类型服务");
    }
}
