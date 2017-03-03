package BuilderPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ray on 2017/3/1.
 * 建造者模式
 * 测试类
 */
public class BuilderPatternEC {
    public static void main(String[] args){
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setVersionID("version : 1.0");
        ehm.setExportDate("2017-3-1");

        Map<String,Collection<ExportDataModel>> mapData = new HashMap<String,Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductNM("衬衣");
        edm1.setProductCategoty("5001111223");
        edm1.setProvince("浙江");
        edm1.setCity("杭州");
        edm1.setPrice(100);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductNM("睡衣");
        edm2.setProductCategoty("500232323");
        edm2.setProvince("江苏");
        edm2.setCity("苏州");
        edm2.setPrice(9999);

        col.add(edm1);
        col.add(edm2);

        mapData.put("宝贝名称，类别，省，城市，价格",col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");

        TxtBuilder txtBuilder = new TxtBuilder();
        Director director = new Director(txtBuilder);
        director.construct(ehm,mapData,efm);
        System.out.println("输出到文本文件的内容");
        System.out.println(txtBuilder.getResult());

        XmlBuilder xmlBuilder = new XmlBuilder();
        Director director2 = new Director(xmlBuilder);
        director2.construct(ehm,mapData,efm);
        System.out.println("输出到xml的内容");
        System.out.println(xmlBuilder.getResult());


    }
}
