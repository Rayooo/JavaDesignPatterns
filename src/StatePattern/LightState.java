package StatePattern;

/**
 * Created by Ray on 2017/3/12.
 * 抽象状态接口类
 */
public interface LightState {
    public abstract void pressSwitch(Light light);
}
