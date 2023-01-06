import org.example.command.XiaoEr;
import org.example.command.cook.GuangDongCook;
import org.example.command.cook.JiangSuCook;
import org.example.command.cuisine.GuangDongCuisine;
import org.example.command.cuisine.ICuisine;
import org.example.command.cuisine.JiangSuCuisine;
import org.junit.Test;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/27
 */
public class ApiTest {
    @Test
    public void test(){
        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDongCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.placeOrder();
    }
}
