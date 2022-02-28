package pages;

import basepages.BaseTest;
import basepages.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;


public class WelcomePage extends BaseTest {
    @Step("Uygulama Kontrolu")
    public void checkOpen(){
        String checkText = findElement(MobileElements.startShopping).getText();
        Assertions.assertEquals("ALIŞVERİŞE BAŞLA",checkText);
        logger.info("Uygulamanın Düzgün Bir Şekilde Açıldığı Kontrol Edildi");
    }
}
