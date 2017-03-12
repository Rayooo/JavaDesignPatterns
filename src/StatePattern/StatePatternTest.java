package StatePattern;

/**
 * Created by Ray on 2017/3/12.
 */
public class StatePatternTest {

    public static void main(String[] args){
        Light light = new Light(new LightOff());

        light.pressSwitch();

        light.pressSwitch();

    }

}
