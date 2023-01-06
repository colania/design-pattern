package org.example;

import org.springframework.context.ApplicationContext;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/28
 */
public class ListenerController {
    private ApplicationContext applicationContext;

    public void test() {
        CustomerLeaveMessage msg = new CustomerLeaveMessage();
        msg.setType(1);
        applicationContext.publishEvent(new CustomerLeaveMessageEvent(msg));

    }
}
