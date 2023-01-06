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
public class Level3AuthLink extends AuthLink {

    public static Instant begin = Instant.parse("2020-06-11T00:00:00.000Z");
    public static Instant end = Instant.parse("2020-06-25T23:59:59.999Z");

    public Level3AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Instant date) {
        Instant instant = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == instant) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待三级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：三级审批负责人完成", " 时间：", instant.toString(), " 审批人：", levelUserName);
        }

        if (instant.isBefore(begin) || instant.isAfter(end)) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：三级审批负责人完成", " 时间：", instant.toString(), " 审批人：", levelUserName);
        }
        return next.doAuth(uId, orderId, date);
    }
}
