package org.example.serviceAdapter.adapter;

import org.example.serviceAdapter.OrderAdapterService;
import org.example.serviceAdapter.service.POPOrderService;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/25
 */
public class POPOrderAdapterService implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();
    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
