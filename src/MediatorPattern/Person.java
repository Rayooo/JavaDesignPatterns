package MediatorPattern;

/**
 * Created by Ray on 2017/3/12.
 * 抽象同事类
 */
public abstract class Person {

    Mediator mediator;

    abstract void setMediator(Mediator mediator);
    abstract void sendMessage(String message);
    abstract void getMessage(String message);

}
