package AdapterPattern.ForObject;

/**
 * Created by Ray on 2017/3/3.
 * 对象适配器测试类
 */
public class AdapterTest {
    public static void main(String[] args){
        TwoHole y = new TwoHole();
        PowerAdapter x = new PowerAdapter(y);
        x.request();
    }
}
