package AdapterPattern;

/**
 * Created by Ray on 2017/3/3.
 * 适配器模式测试类
 */
public class AdaoterTest {
    public static void main(String[] args){
        StudentAdapter student = new StudentAdapter();
        student.setName("Ray");
        student.study();
        student.sport();
        student.exam();
        student.race();
        student.volunteer();
    }
}
