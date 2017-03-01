package BuilderPattern;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Ray on 2017/3/1.
 */
public class XmlBuilder implements Builder{
    private StringBuffer buffer = new StringBuffer();


    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append("buildHeader");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        buffer.append("buildBody");
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append("buildFooter");
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
