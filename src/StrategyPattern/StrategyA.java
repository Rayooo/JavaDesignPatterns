package StrategyPattern;

/**
 * Created by Ray on 2017/3/10.
 * 具体策略类
 */
public class StrategyA extends Strategy {

    @Override
    public void backupDatabase() {
        System.out.println("策略A：逻辑备份");
    }
}
