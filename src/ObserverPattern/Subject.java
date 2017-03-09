package ObserverPattern;

/**
 * Created by Ray on 2017/3/9.
 * 抽象主题接口
 */
public interface Subject {

    void registerObserver(Observer o);      //用户订阅
    void unregisterObserver(Observer o);    //取消订阅
    void notifyObservers();                 //消息推送

}
