package Decorator;

/**
 * Created by Ray on 2017/3/3.
 * 具体构件类
 */
public class Burger extends Breakfast {

    public Burger(){
        description = "汉堡";
    }

    @Override
    public double cost() {
        return 15;
    }
}
