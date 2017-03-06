package ProxyPattern;

/**
 * Created by Ray on 2017/3/6.
 * 客户测试类
 */
public class ProxyPattern {

    public static void main(String[] args){
        BuyTicket train = new Train();
        TicketCenter ticketCenter = new TicketCenter(train);
        ticketCenter.buy();
    }

}
