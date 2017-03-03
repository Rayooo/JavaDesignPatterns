package Decorator;

/**
 * Created by Ray on 2017/3/3.
 * 具体装饰者
 */
public class Ham extends CondimentDecorator {

    public Ham(Breakfast myfood) {
        super(myfood);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ",火腿";
    }

    @Override
    public double cost() {
        return super.cost()+10;
    }
}
