package BuilderPattern;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Ray on 2017/3/1.
 * 建造者接口
 * 主要是把导出各种格式文件的处理过程的步骤定义出来，每个步骤负责构建最终导出文件的一部分
 */
public interface Builder {
    public void buildHeader(ExportHeaderModel ehm);
    public void buildBody(Map<String, Collection< ExportDataModel >> mapData);
    public void buildFooter(ExportFooterModel efm);
}
