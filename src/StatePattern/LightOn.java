package StatePattern;

/**
 * Created by Ray on 2017/3/12.
 * 具体状态类
 */
public class LightOn implements LightState {
    @Override
    public void pressSwitch(Light light) {
        System.out.println("当前为开状态，将关闭电灯");
        light.setState(new LightOff());
    }
}
