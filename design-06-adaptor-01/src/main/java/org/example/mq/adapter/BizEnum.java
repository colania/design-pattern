package org.example.mq.adapter;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/25
 */
public enum BizEnum {
    CREATE_ACCOUNT(1, "开户"),
    ORDER(2,"下单"),
    POPORDER(3,"订单妥投消息"),
    ;

    public int code ;
    public String info ;

    BizEnum(int code, String info) {
        this.code = code;
        this.info = info;
    }
}
