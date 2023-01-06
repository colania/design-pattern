package org.example.responsibilityChain.node;

import org.example.responsibilityChain.AuthInfo;
import org.example.responsibilityChain.AuthLink;
import org.example.responsibilityChain.AuthService;

import java.time.Instant;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/27
 */
public class Level2AuthLink extends AuthLink {

    public Level2AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    public static Instant begin = Instant.parse("2020-06-11T00:00:00.000Z");
    public static Instant end = Instant.parse("2020-06-25T23:59:59.999Z");
    @Override
    public AuthInfo doAuth(String uId, String orderId, Instant authDate) {
        Instant instant = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == instant) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待二级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", instant.toString(), " 审批人：", levelUserName);
        }
        if (instant.isAfter(begin) && instant.isBefore(end)){
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", instant.toString(), " 审批人：", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);

    }
}
