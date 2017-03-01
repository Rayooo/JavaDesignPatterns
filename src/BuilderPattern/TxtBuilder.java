package BuilderPattern;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Ray on 2017/3/1.
 */
public class TxtBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getVersionID()).append(",").append(ehm.getExportDate()).append("\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for(String tblName: mapData.keySet()){
            //拼接表名称
            buffer.append(tblName).append("\n");
            //拼接具体数据
            for(ExportDataModel edm : mapData.get(tblName)){
                buffer.append(edm.getProductNM()).append(",").append(edm.getProductCategoty()).append(",")
                        .append(edm.getProvince()).append(",").append(edm.getCity()).append(",")
                        .append(edm.getPrice()).append("\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
