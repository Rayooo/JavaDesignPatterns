package BuilderPattern;

/**
 * Created by Ray on 2017/3/1.
 * 描述导出的数据文件的文件体信息
 */
public class ExportDataModel {
    private String productNM;
    private String productCategoty;
    private String province;
    private String city;
    private double price;

    public String getProductNM() {
        return productNM;
    }

    public void setProductNM(String productNM) {
        this.productNM = productNM;
    }

    public String getProductCategoty() {
        return productCategoty;
    }

    public void setProductCategoty(String productCategoty) {
        this.productCategoty = productCategoty;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
