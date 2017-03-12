package StatePattern;

/**
 * Created by Ray on 2017/3/12.
 * 具体状态类
 */
public class LightOff implements LightState {

    @Override
    public void pressSwitch(Light light) {
        System.out.println("当前为关状态，将打开电灯");
        light.setState(new LightOn());
    }
}
