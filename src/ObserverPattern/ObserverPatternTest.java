package ObserverPattern;

/**
 * Created by Ray on 2017/3/9.
 * 测试类
 */
public class ObserverPatternTest {

    public static void main(String[] args){
        Financial financial = new Financial();
        User1 a = new User1(financial);
        User2 b = new User2(financial);
        financial.distributeMsg("理财通收益突破5%");
    }

}
