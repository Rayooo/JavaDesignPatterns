package MediatorPattern;

/**
 * Created by Ray on 2017/3/12.
 */
public class MediatorPattern {
    public static void main(String[] args){
        Mediator mediator = new HouseMediator();
        Person person1 = new Renter();
        Person person2 = new Landlor();

        mediator.setA(person1);
        mediator.setB(person2);

        person1.setMediator(mediator);
        person2.setMediator(mediator);

        person1.sendMessage("我想租套房子");
        person2.sendMessage("我有套房子想出租");

    }
}
