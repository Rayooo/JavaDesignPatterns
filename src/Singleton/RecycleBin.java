package Singleton;

/**
 * Created by Ray on 2017/3/2.
 */
public class RecycleBin {
    //饿汉式单例模式
    //当程序启动或单例类被加载时，单例类实例就已经被创建
    private static RecycleBin instance = new RecycleBin();

    private RecycleBin(){

    }

    public static RecycleBin getInstance(){
        return instance;
    }

}
