package org.example;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/26
 */
public class SsoInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        return ticket.equals("success");
    }
}
