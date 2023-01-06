import org.example.pipline.Pipline;
import org.example.pipline.source.IntegerSource;
import org.junit.Test;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/28
 */
public class ApiTest {
    @Test
    public void test(){
        Pipline pipeline = new Pipline(new IntegerSource());
        pipeline.init(null);
        pipeline.startup();
        pipeline.shutdown();
    }
}
