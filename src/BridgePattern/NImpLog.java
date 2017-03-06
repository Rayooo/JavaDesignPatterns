package BridgePattern;

/**
 * Created by Ray on 2017/3/6.
 * 具体实现化角色
 */
public class NImpLog extends ImpLog {
    @Override
    public void execute(String msg) {
        System.out.println("在.NET平台上记录日志"+msg);
    }
}
