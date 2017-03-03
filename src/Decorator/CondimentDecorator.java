package Decorator;

/**
 * Created by Ray on 2017/3/3.
 * 抽象装饰类
 * 早餐抽象类的子类
 */
public class CondimentDecorator extends Breakfast{

    Breakfast myfood;

    public CondimentDecorator(Breakfast myfood){
        this.myfood = myfood;
    }

    @Override
    public String getDescription() {
        return myfood.getDescription();
    }

    @Override
    public double cost() {
        return myfood.cost();
    }
}
