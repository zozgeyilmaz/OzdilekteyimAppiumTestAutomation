package pages;

import basepages.BaseTest;
import basepages.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ShoppingPage extends BaseTest {
    @Step("Alışverişe Başla Butonu Tıklanır")
    public void clickStartShopping(){
        findElement(MobileElements.startShopping).click();
        logger.info("Alışverişe Başla Butonuna Tıklandı");
    }

    @Step("Alışveriş Sayfası Kontrolu")
    public void checkShopping(){
        String checkShop = findElement(MobileElements.checkShopping).getAttribute("resource-id");
        Assert.assertEquals("com.ozdilek.ozdilekteyim:id/relLayStore",checkShop);
        logger.info("Alışveriş Sayfasının Açıldığı Doğrulandı");
    }
}
