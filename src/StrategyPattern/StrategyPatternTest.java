package StrategyPattern;

/**
 * Created by Ray on 2017/3/10.
 * 客户测试类
 */
public class StrategyPatternTest {
    public static void main(String[] args){
        System.out.println("尝试策略A");
        DBContext context = new DBContext(new StrategyA());
        context.executeBackupDatabase();

        System.out.println("尝试策略B");
        context = new DBContext(new StrategyB());
        context.executeBackupDatabase();

        System.out.println("尝试策略C");
        context = new DBContext(new StrategyC());
        context.executeBackupDatabase();


    }
}
