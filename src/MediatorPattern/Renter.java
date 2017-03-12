package MediatorPattern;

/**
 * Created by Ray on 2017/3/12.
 */
public class Renter extends Person {

    @Override
    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    void sendMessage(String message) {
        this.mediator.send(message,this);
    }

    @Override
    void getMessage(String message) {
        System.out.println("租房者收到信息"+message);
    }
}
