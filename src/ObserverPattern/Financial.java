package ObserverPattern;


import java.util.ArrayList;

/**
 * Created by Ray on 2017/3/9.
 * 具体主题  理财通
 */
public class Financial implements Subject {

    private ArrayList<Observer> userList = new ArrayList<>();
    private String msg;

    @Override
    public void registerObserver(Observer o) {
        if(!userList.contains(o)){
            userList.add(o);
        }
    }

    @Override
    public void unregisterObserver(Observer o) {
        if(userList.contains(o)){
            userList.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: userList){
            observer.update(msg);
        }
    }

    public void distributeMsg(String s){
        this.msg = s;
        notifyObservers();
    }

}
