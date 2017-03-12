package CommandPattern;

/**
 * Created by Ray on 2017/3/12.
 * 主板实现类
 */
public class GigaMainBoard implements MainBoardApi {

    @Override
    public void open() {
        System.out.println("技嘉主板现在正在开机");
        System.out.println("接通电源");
        System.out.println("设备检查");
        System.out.println("装载系统");
        System.out.println("机器正常运转起来");
        System.out.println("机器已经打开，请操作");
    }
}
