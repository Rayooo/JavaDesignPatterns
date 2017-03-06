package ProxyPattern;

/**
 * Created by Ray on 2017/3/6.
 * 具体主题类
 */
public class Train implements BuyTicket {

    @Override
    public void showTicket() {
        System.out.println("一张火车票");
    }

}
