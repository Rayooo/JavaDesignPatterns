package Singleton;

/**
 * Created by Ray on 2017/3/2.
 */
public class RecycleBinSync {
    private static RecycleBinSync instance = null;

    private RecycleBinSync() {

    }

    //synchronized 关键字保证了在多线程环境下，RecycleBinSync只能创建一个实例

    //低效
    /*
    public synchronized static RecycleBinSync getInstance() {
        if(instance == null){
            instance = new RecycleBinSync();
        }
        return instance;
    }
*/
    //双重检查加锁,效率更高
    public static RecycleBinSync getInstance(){
        synchronized (RecycleBin.class){
            if(instance == null){
                instance = new RecycleBinSync();
            }
        }
        return instance;
    }


}
