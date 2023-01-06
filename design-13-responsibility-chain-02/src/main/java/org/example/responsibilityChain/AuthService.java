package org.example.responsibilityChain;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/27
 */
public class AuthService {
    private static Map<String, Instant> authMap = new ConcurrentHashMap<String, Instant>();

    public static Instant queryAuthInfo(String uId, String orderId) {
        return authMap.get(uId.concat(orderId));
    }

    public static void auth(String uId, String orderId) {
        authMap.put(uId.concat(orderId), Instant.now());
    }
}
