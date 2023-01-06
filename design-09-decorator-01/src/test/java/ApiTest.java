import org.example.LoginSsoDecorator;
import org.example.SsoInterceptor;
import org.junit.Test;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/26
 */
public class ApiTest {
    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }

}
