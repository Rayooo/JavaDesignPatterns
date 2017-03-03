package AdapterPattern;

/**
 * Created by Ray on 2017/3/3.
 * 被适配者类
 * 该类在使用中可能需要添加一些方法，但又不想改变此类
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void study(){
        System.out.println(name + "在学习");
    }

    public void sport(){
        System.out.println(name + "在运动");
    }

    public void exam(){
        System.out.println(name + "在考试");
    }

}

