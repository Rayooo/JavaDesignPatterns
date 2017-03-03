package Singleton;

/**
 * Created by Ray on 2017/3/2.
 * 单例模式
 */
public class SingletonPattern {

    public static void main(String[] args){

        Mythread mythread = new Mythread();
        for(int i = 0;i < 10;i ++){
            Thread t = new Thread(mythread,String.valueOf(i));
            t.start();
        }

        for(int i = 0;i < 10; i++){

            Thread t = new Thread(() -> {
                RecycleBin x = null;
                x = RecycleBin.getInstance();
                System.out.println(x + ":" + x.hashCode());
            },String.valueOf(i));

            t.start();
        }

    }


}
