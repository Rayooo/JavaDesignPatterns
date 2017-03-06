package BridgePattern;

/**
 * Created by Ray on 2017/3/6.
 * 桥接具体类，修正的抽象化角色
 */
public class DatabaseLog extends Log {


    public DatabaseLog(ImpLog implementor) {
        super(implementor);
    }

    @Override
    public void write(String log) {
        implementor.execute("使用数据库的方式：" + log);
    }
}
