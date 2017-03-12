package MediatorPattern;

/**
 * Created by Ray on 2017/3/12.
 * 具体中介者类
 */
public class HouseMediator extends Mediator {

    private Person personA,personB;

    @Override
    void send(String message, Person person) {
        if(person.equals(personA)){
            personB.getMessage(message);
        }
        else{
            personA.getMessage(message);
        }
    }

    @Override
    void setA(Person a) {
        personA = a;
    }

    @Override
    void setB(Person b) {
        personB = b;
    }
}
