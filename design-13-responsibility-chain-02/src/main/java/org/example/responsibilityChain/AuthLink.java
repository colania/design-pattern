package org.example.responsibilityChain;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/27
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

/**
 * 审核规定；
 * 1. 601-610 三级审批 + 二级审批
 * 2. 611-620 三级审批 + 二级审批 + 一级审批
 * 3. 其他时间 三级审批
 */
public abstract class AuthLink {
    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    protected Instant instant = Instant.now();
    protected String levelUserId;                           // 级别人员ID
    protected String levelUserName;                         // 级别人员姓名
    private AuthLink next;                                  // 责任链

    public String getLevelUserId() {
        return levelUserId;
    }

    public void setLevelUserId(String levelUserId) {
        this.levelUserId = levelUserId;
    }

    public String getLevelUserName() {
        return levelUserName;
    }

    public void setLevelUserName(String levelUserName) {
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Instant date);

}
