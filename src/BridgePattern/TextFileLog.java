package BridgePattern;

/**
 * Created by Ray on 2017/3/6.
 * 桥接具体类，修正的抽象化角色
 */
public class TextFileLog extends Log {


    public TextFileLog(ImpLog implementor) {
        super(implementor);
    }

    @Override
    public void write(String log) {
        implementor.execute("使用文本文件的方式" + log);
    }
}
