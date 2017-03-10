package StrategyPattern;

/**
 * Created by Ray on 2017/3/10.
 * 具体策略类
 */
public class StrategyC extends Strategy {

    @Override
    public void backupDatabase() {
        System.out.println("策略C：热备份");
    }

}
