package indi.wwei.design.demo.store;

import java.util.Map;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/21
 */
public interface ICommodity {

    void sendCommodity(String uId , String commodityId , String bizId , Map<String ,String > extMap) throws Exception;
}
