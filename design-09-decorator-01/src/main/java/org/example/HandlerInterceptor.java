package org.example;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/26
 */
public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
