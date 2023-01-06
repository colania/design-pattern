import org.example.CacheService;
import org.example.factory.JDKProxy;
import org.example.factory.impl.EGMCacheAdapter;
import org.example.factory.impl.IIRCacheAdapter;
import org.junit.Test;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/21
 */
public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheService.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheService.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
