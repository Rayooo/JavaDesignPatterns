package CompositePattern;

/**
 * Created by Ray on 2017/3/7.
 * 叶子构件类
 */
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public Component addChild(Component leftChild, Component rightChild) {
        return this;
    }

    @Override
    public int getLength() {
        return 1;
    }

    @Override
    public String getName() {
        return name;
    }
}
