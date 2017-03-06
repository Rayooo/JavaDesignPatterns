package BridgePattern;

/**
 * Created by Ray on 2017/3/6.
 * 客户测试类
 */
public class BridgePattern {

    public static void main(String[] args){
        ImpLog implementor = new NImpLog();
        Log dblog = new DatabaseLog(implementor);
        dblog.write("I am fine");

        implementor = new JImpLog();
        dblog = new TextFileLog(implementor);
        dblog.write("I am ok");

    }

}

