package Decorator;

/**
 * Created by Ray on 2017/3/3.
 * 具体构件类
 */
public class Toast extends Breakfast {

    public Toast(){
        description = "吐司";
    }

    @Override
    public double cost() {
        return 10;
    }
}
