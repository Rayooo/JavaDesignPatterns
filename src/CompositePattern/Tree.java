package CompositePattern;

/**
 * Created by Ray on 2017/3/7.
 * 容器构件类
 */
public class Tree extends Component {

    private String name;
    private Component leftChild;
    private Component rightChild;

    public Tree(String name, Component leftChild, Component rightChild) {
        this.name = name;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Tree(String name) {
        this.name = name;
        this.leftChild = null;
        this.rightChild = null;
    }


    @Override
    public Component addChild(Component leftChild, Component rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    public void getTreeInfo(){  //得到树或叶子的详细信息
        System.out.println("This tree name is" + getName());

        if(this.leftChild instanceof Leaf){
            System.out.println(getName() + "'s left child is " + this.leftChild.getName() + ", it is a Leaf");
        }

        if(this.leftChild instanceof Tree){
            System.out.println(getName() + "'s left child is "+ this.leftChild.getName() + ", it is a Tree");
        }

        if(this.leftChild == null){
            System.out.println(getName() + "'s left child is a null");
        }

        if(this.rightChild instanceof Leaf){
            System.out.println(getName() + "'s right child is " + this.rightChild.getName() + ", it is a Leaf");
        }

        if(this.rightChild instanceof Tree){
            System.out.println(getName() + "'s right child is "+ this.rightChild.getName() + ", it is a Tree");
        }

        if(this.rightChild == null){
            System.out.println(getName() + "'s right child is a null");
        }

    }

    @Override
    public int getLength() {
        if(this.leftChild == null){     //没有左子树
            if(this.rightChild == null){    //没有右子树
                return 1;
            }
            else{                       //有右子树
                return this.rightChild.getLength() + 1;
            }
        }
        else{                       //有左子树
            if(this.rightChild == null){            //没有右子树
                return this.leftChild.getLength() + 1;
            }
            else{                   //有右子树
                if(this.leftChild.getLength() >= this.rightChild.getLength()){
                    return this.leftChild.getLength() + 1;
                }
                else{
                    return this.rightChild.getLength() + 1;
                }
            }
        }
    }
}
