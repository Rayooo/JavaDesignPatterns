package Flyweight;

/**
 * Created by Ray on 2017/3/5.
 * 测试类
 */
public class FlyweightPatternTest {

    public static void main(String[] args){
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight cf1 = factory.getFlyweight(FlyweightFactory.KEY_CHAR_A);
        cf1.show("字体：宋体");

        Flyweight cf2 = factory.getFlyweight(FlyweightFactory.KEY_CHAR_B);
        cf2.show("大小：12px");

        Flyweight cf3 = factory.getFlyweight(FlyweightFactory.KEY_CHAR_A);
        cf3.show("字体：隶书");

        Flyweight cf4 = factory.getFlyweight(FlyweightFactory.KEY_CHAR_B);
        cf4.show("大小：12px，字体：隶书");

        System.out.println("只生成了"+factory.getCacheSize()+"种享元对象");

    }

}
