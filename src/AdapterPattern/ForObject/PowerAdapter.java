package AdapterPattern.ForObject;

/**
 * Created by Ray on 2017/3/3.
 * 对象适配器类
 */
public class PowerAdapter implements ThreeHoleSocket {

    TwoHole twoHoleAdaptee;

    public PowerAdapter(TwoHole twoHoleAdaptee) {
        this.twoHoleAdaptee = twoHoleAdaptee;
    }

    @Override
    public void request() {
        twoHoleAdaptee.SpecificRequest();
        System.out.println("使用了转换插座之后，两孔插头连接到了三孔插座上");
    }
}
