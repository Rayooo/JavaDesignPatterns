package BuilderPattern;

/**
 * Created by Ray on 2017/3/1.
 * 描述导出的数据文件的头部信息
 */
public class ExportHeaderModel {
    private String versionID;
    private String exportDate;

    public String getVersionID() {
        return versionID;
    }

    public void setVersionID(String versionID) {
        this.versionID = versionID;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
