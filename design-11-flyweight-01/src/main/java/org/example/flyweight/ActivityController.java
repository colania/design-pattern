package org.example.flyweight.util;

import org.example.flyweight.Activity;
import org.example.flyweight.ActivityFactory;
import org.example.flyweight.Stock;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/27
 */
public class ActivityController {

    private org.example.flyweight.util.RedisUtil redisUtils = new org.example.flyweight.util.RedisUtil();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
