package ObserverPattern;

/**
 * Created by Ray on 2017/3/9.
 * 具体观察者
 */
public class User2 implements Observer{
    private Subject subject;

    public User2(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("我收到了一条来自理财通的消息："+msg+"这条消息与我无关");
    }
}
