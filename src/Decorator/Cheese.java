package Decorator;

/**
 * Created by Ray on 2017/3/3.
 * 具体装饰者类
 */
public class Cheese extends CondimentDecorator {

    public Cheese(Breakfast myfood) {
        super(myfood);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",起司";
    }

    @Override
    public double cost() {
        return super.cost()+5;
    }
}
