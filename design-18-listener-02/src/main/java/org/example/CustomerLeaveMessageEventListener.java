package org.example;

import org.springframework.context.event.EventListener;

/**
 * @description:
 * 使用注解@EventListener实现监听
 * @author：wwei
 * @date: 2022/12/28
 */
public class CustomerLeaveMessageEventListener {
    @EventListener
    public void sendEmail(CustomerLeaveMessageEvent event) {
        CustomerLeaveMessage source = (CustomerLeaveMessage)event.getSource();
        Integer type = source.getType();
        if (type ==1){
            System.out.println("发送邮件给管理员");
        }

    }
}
