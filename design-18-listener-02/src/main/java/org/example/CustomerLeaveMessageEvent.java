package org.example;


import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/28
 */
public class CustomerLeaveMessageEvent extends ApplicationEvent {

    public CustomerLeaveMessageEvent(Object source) {
        super(source);
    }


}
