package Decorator;

/**
 * Created by Ray on 2017/3/3.
 * 装饰者模式
 */
public class DecoratorTest {
    public static void main(String[] args){
        Breakfast breakfast1 = new Toast();
        System.out.println("您的餐点为："+breakfast1.getDescription()+"，价格为："+breakfast1.cost());

        Breakfast breakfast2 = new Toast();
        breakfast2 = new Ham(breakfast2);
        breakfast2 = new Ham(breakfast2);
        System.out.println("您的餐点为："+breakfast2.getDescription()+"，价格为："+breakfast2.cost());

        Breakfast breakfast3 = new Burger();
        breakfast3 = new Ham(breakfast3);
        breakfast3 = new Cheese(breakfast3);
        breakfast3 = new Cheese(breakfast3);
        System.out.println("您的餐点为："+breakfast3.getDescription()+"，价格为："+breakfast3.cost());


    }
}
