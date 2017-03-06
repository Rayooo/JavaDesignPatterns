package ProxyPattern;

/**
 * Created by Ray on 2017/3/6.
 * 代理角色类
 */
public class TicketCenter implements BuyTicket {

    private BuyTicket ticket;

    public TicketCenter(BuyTicket ticket){
        this.ticket = ticket;
    }


    @Override
    public void showTicket() {
        ticket.showTicket();
    }

    public void buy(){
        System.out.print("通过代理购得：");
        showTicket();
    }

}
