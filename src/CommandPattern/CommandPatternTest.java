package CommandPattern;

/**
 * Created by Ray on 2017/3/12.
 * 命令模式测试类
 */
public class CommandPatternTest {
    public static void main(String[] args){
        //组装机器
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);

        //为机箱上的按钮设置对应的命令，让按钮知道该干什么
        Box box = new Box();
        box.setOpenCommand(openCommand);

        //然后模拟按下机箱上的按钮
        box.openButtonPressed();

    }
}
