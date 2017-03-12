package CommandPattern;

/**
 * Created by Ray on 2017/3/12.
 */
public class Box {

    //开机命令对象
    private Command openCommand;

    //设置开机命令对象
    public void setOpenCommand(Command command){
        this.openCommand = command;
    }

    public void openButtonPressed(){
        openCommand.execute();
    }

}
