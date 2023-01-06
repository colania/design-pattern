package org.example;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/26
 */
public class SsoDecorator implements HandlerInterceptor{
    private HandlerInterceptor handlerInterceptor ;

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
