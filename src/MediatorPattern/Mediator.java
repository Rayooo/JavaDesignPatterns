package MediatorPattern;

/**
 * Created by Ray on 2017/3/12.
 * 抽象中介者
 */
public abstract class Mediator {
    abstract void send(String message,Person person);
    abstract void setA(Person a);
    abstract void setB(Person b);
}
