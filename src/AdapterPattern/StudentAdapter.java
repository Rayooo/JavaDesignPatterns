package AdapterPattern;

/**
 * Created by Ray on 2017/3/3.
 * 适配器类
 * 该类以Student类为基础，在此基础上添加类一些需要的方法
 */
public class StudentAdapter extends Student implements Target {
    @Override
    public void race() {
        System.out.println(this.getName() + "参加演讲比赛");
    }

    @Override
    public void volunteer() {
        System.out.println(getName() + "参加志愿者活动");
    }
}
