package pages;

import basepages.BaseTest;
import basepages.MobileElements;
import com.thoughtworks.gauge.Step;

public class ProductPage extends BaseTest {
    @Step("Sayfa İki Defa Aşağıya Kaydırma")
    public void scrollDown() throws InterruptedException {
        scroll();
        scroll();
        logger.info("Sayfa Aşağıya Kaydırıldı");
    }

    @Step("Rastgele Bir Ürün Seçme")
    public void randomProduct(){
        randomSelect(MobileElements.selectProduct).click();
        logger.info("Rasgele Bir Ürün Seçildi");
    }

}
