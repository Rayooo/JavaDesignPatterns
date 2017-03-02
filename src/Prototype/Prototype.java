package Prototype;

/**
 * Created by Ray on 2017/3/2.
 */
public class Prototype {
    public static void main(String[] args){
        Resume resume = new ConcreteResume("Ray");
        resume.setPersonInfo("4.13","男","HZNU");
        resume.setWorkExperience("2016.4","ThumbClass");

        //克隆B对象
        Resume b = null;
        try {
            b = (Resume)resume.cloneMe();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //输出A和B对象
        System.out.println("-----------------A-----------------");
        resume.display();
        System.out.println("-----------------B-----------------");
        if (b != null) {
            b.display();
        }

        /*
        * 测试A==B?
        * 对任何的对象x，都有x.clone() != x 即克隆对象与原对象不是同一个对象
        * */
        System.out.println("A == B ?");
        System.out.println(resume == b);

        /*
        * 对任何的对象x，都有x.clone().getClass() == x.getClass() ，即克隆对象与原对象的类型一样
        * */
        System.out.println("A.getClass() == B.getClass() ?");
        if (b != null) {
            System.out.println(resume.getClass() == b.getClass());
        }
        System.out.println(resume.getClass());


    }


}
