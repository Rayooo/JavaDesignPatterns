package CommandPattern;

/**
 * Created by Ray on 2017/3/12.
 * 命令具体的实现
 */
public class OpenCommand implements Command {

    private MainBoardApi mainBoardApi = null;

    public OpenCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    @Override
    public void execute() {
        mainBoardApi.open();
    }
}
