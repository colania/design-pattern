package org.example;

import org.springframework.context.ApplicationListener;

/**
 * @description:
 * 使用实现ApplicationListener接口的形式注册监听
 * @author：wwei
 * @date: 2022/12/28
 */
public class CustomerLeaveMessageEventListener2 implements ApplicationListener<CustomerLeaveMessageEvent> {
    @Override
    public void onApplicationEvent(CustomerLeaveMessageEvent event) {
        CustomerLeaveMessage source = (CustomerLeaveMessage) event.getSource();
        Integer type = source.getType();
        if (type == 2) {
            System.out.println("用户留言后的逻辑响应，发送站内通知给管理员：");
        }
    }
}
