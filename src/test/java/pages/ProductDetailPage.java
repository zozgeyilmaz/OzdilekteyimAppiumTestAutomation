package pages;

import basepages.BaseTest;
import basepages.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductDetailPage extends BaseTest {
    @Step("Ürün Detay Sayfası Kontrolu")
    public void checkProductDetail(){
        String checkProductDetail = findElement(MobileElements.checkProductDetail).getText();
        Assert.assertEquals("Listeme Ekle",checkProductDetail);
        logger.info("Ürün Detay Sayfasına Gidildiği Doğrulandı");
    }

    @Step("Favoriler Butonuna Tıklandı")
    public void addFav(){
        findElement(MobileElements.clickFav).click();
        logger.info("Favorilere Ekle Butonuna Tıklandı");
    }

    @Step("Seçilen Ürünü Sepete Ekle")
    public void addCart(){
        if (findElement(MobileElements.checkBodySize).getAttribute("enabled").equals("true")){
            randomSelect(MobileElements.selectBodySize).click();
            findElement(MobileElements.addCart).click();
        }
        else {
            findElement(MobileElements.addCart).click();
        }
        logger.info("Sepete Ekle Butonuna Tıklandı");
    }
}
