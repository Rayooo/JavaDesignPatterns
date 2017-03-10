package StrategyPattern;

/**
 * Created by Ray on 2017/3/10.
 * 具体策略类
 */
public class StrategyB extends Strategy {

    @Override
    public void backupDatabase() {
        System.out.println("策略B：冷备份");
    }
}
