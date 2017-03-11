package ChainOfResponsibility;

/**
 * Created by Ray on 2017/3/11.
 * 抽象处理者
 */
public abstract class Handler {

    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract String handleFeeRequest(String user,double fee);

}
