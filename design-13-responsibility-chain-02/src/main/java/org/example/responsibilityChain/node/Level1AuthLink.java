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
public class Level1AuthLink extends AuthLink {
    public Level1AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Instant authDate) {
        Instant date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (date == null) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待一级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：一级审批完成负责人", " 时间：", date.toString(), " 审批人：", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }
}
