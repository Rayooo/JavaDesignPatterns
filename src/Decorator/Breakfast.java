package Decorator;

/**
 * Created by Ray on 2017/3/3.
 * 抽象构件类
 * 早餐的抽象父类
 */
public abstract class Breakfast {
    public String description = "未知";

    public String getDescription(){         //获得所订物品的描述，此方法在父类中已实现
        return description;
    }

    public abstract double cost();          //在子类中实现

}
