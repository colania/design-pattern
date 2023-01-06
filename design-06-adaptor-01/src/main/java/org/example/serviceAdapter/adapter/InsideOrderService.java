package org.example.serviceAdapter.adapter;

import org.example.serviceAdapter.OrderAdapterService;
import org.example.serviceAdapter.service.OrderService;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/25
 */
public class InsideOrderService implements OrderAdapterService {
    private OrderService orderService = new OrderService();
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
