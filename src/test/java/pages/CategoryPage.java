package pages;

import basepages.BaseTest;
import basepages.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class CategoryPage extends BaseTest {
    @Step("Katagori Sekmesi ile Sayfa açılır")
    public void clickCategory(){
        findElement(MobileElements.clickCategory).click();
        logger.info("Kategori Sekmesine Tıklandı");
    }

    @Step("Kategori Sekmesi Kontrolu")
    public void checkCategory(){
        String checkCategory = findElement(MobileElements.checkCategory).getAttribute("content-desc");
        Assert.assertEquals("Kategoriler",checkCategory);
        logger.info("Kategori Sekmesine Tıklandığı Doğrulandı");
    }

    @Step("Kadın Seçeneğine Tıklama")
    public void clickWoman(){
        findElement(MobileElements.clickWoman).click();
        logger.info("Kadın Seçeneğine Tıklandı");
    }

    @Step("Pantolon Kategorisi açılır")
    public void clickTrousers(){
        findElement(MobileElements.clickTrousers).click();
        logger.info("Pantolon Kategorisine Tıklandı");
    }

}
