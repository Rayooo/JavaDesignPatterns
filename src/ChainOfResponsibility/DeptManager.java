package ChainOfResponsibility;

/**
 * Created by Ray on 2017/3/11.
 * 具体处理者
 */
public class DeptManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";

        if(fee < 1000){
            if("张三".equals(user)){
                str = "成功，部门经理同意"+user+"的聚餐费用："+fee;
            }
            else{
                str = "失败，部门经理不同意"+user+"的聚餐费用："+fee;
            }
        }
        else{
            if(getSuccessor() != null){
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }
        return str;

    }
}
