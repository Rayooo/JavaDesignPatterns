package ChainOfResponsibility;

/**
 * Created by Ray on 2017/3/11.
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args){
        //先组装责任链
        Handler h1 = new GeneralManager();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManager();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //测试
        String test1 = h3.handleFeeRequest("张三",300);
        System.out.println(test1);

        String test2 = h3.handleFeeRequest("李四",300);
        System.out.println(test2);

        String test3 = h3.handleFeeRequest("张三",700);
        System.out.println(test3);

        String test4 = h3.handleFeeRequest("李四",700);
        System.out.println(test4);

        String test5 = h3.handleFeeRequest("张三",1500);
        System.out.println(test5);

        String test6 = h3.handleFeeRequest("李四",1500);
        System.out.println(test6);


    }
}
