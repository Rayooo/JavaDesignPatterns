package Flyweight;

/**
 * Created by Ray on 2017/3/5.
 * 具体享元类
 */
public class ConcreteFlyweight extends Flyweight {
    private char value; //内部状态，对象创建后，内部状态就不在改变，因此，具体享元类一般设计为不变类

    public ConcreteFlyweight(char internalState){
        this.value = internalState;
    }


    @Override
    public void show(String externState) {
        System.out.println("字母:"+this.value+";外部状态["+externState+"]");
    }
}
