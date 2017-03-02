package Singleton;

/**
 * Created by Ray on 2017/3/2.
 */
public class Mythread implements Runnable {

    @Override
    public void run() {
        RecycleBinSync x = null;
        x = RecycleBinSync.getInstance();
        System.out.println(x + ":" + x.hashCode());
    }
}
