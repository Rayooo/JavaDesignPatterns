package StrategyPattern;

/**
 * Created by Ray on 2017/3/10.
 * 环境类
 */
public class DBContext {
    private Strategy strategy;

    public DBContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeBackupDatabase(){
        strategy.backupDatabase();
    }

}
