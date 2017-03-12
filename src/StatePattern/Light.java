package StatePattern;

/**
 * Created by Ray on 2017/3/12.
 *  上下文角色
 */
public class Light {

    private LightState state;

    public Light(LightState state) {
        this.state = state;
    }

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
    }

    public void pressSwitch(){
        state.pressSwitch(this);
    }
}
