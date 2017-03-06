package BridgePattern;

/**
 * Created by Ray on 2017/3/6.
 * 桥接类，抽象化角色
 */
public abstract class Log {

    protected ImpLog implementor;

    public Log(ImpLog implementor) {
        this.implementor = implementor;
    }

    public abstract void write(String log);
}
