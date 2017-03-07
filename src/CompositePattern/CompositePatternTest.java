package CompositePattern;

/**
 * Created by Ray on 2017/3/7.
 */
public class CompositePatternTest {

    public static void main(String[] args){
        Component tree = new Tree("A");
        Component leafChild = new Leaf("A1");
        Component rightChild = new Leaf("A2");
        System.out.println("-------------------------------");


        tree.addChild(leafChild,rightChild);
        tree.getTreeInfo();
        System.out.println("-------------------------------");


        Component tree2 = new Tree("A2");
        tree2.addChild(tree,leafChild);
        tree2.getTreeInfo();
        System.out.println("-------------------------------");


        Component tree3 = new Tree("A3");
        tree3.addChild(tree,null);
        tree3.getTreeInfo();
        System.out.println("-------------------------------");


        Component tree4 = new Tree("A4");
        tree4.addChild(null,tree);
        tree4.getTreeInfo();
        System.out.println("树高度为:" + tree4.getLength());

    }

}
