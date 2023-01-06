import org.example.channel.Pay;
import org.example.channel.WXPay;
import org.example.channel.ZfbPay;
import org.example.mode.PayFaceMode;
import org.example.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/26
 */
public class ApiTest {
    @Test
    public void test(){
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WXPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }
}
