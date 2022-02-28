package pages;

import basepages.BaseTest;
import basepages.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;


public class LoginPage extends BaseTest {
    @Step("Üye Giriş Sayfası Kontrolu")
    public void checkLogin(){
        String checkLogin = findElement(MobileElements.login).getText();
        Assert.assertEquals("Giriş Yap",checkLogin);
        logger.info("Üye Giriş Sayfasının Açıldığı Doğrulandı");
    }

    @Step("Kullanıcı Adı Girişi")
    public void sendEmail(){
        findElement(MobileElements.sendEmail).sendKeys("text");
        logger.info("E-posta Girişi Yapıldı");
    }
    @Step("Kullanıcı Şifre Girişi")
    public void sendPassword(){
        findElement(MobileElements.sendPassword).sendKeys("şifre");
        logger.info("Şifre Girişi Yapıldı");
    }
    @Step("Geri Dön")
    public void comeBackTwoTimes() throws InterruptedException {
        clickBack();
        TimeUnit.SECONDS.sleep(2);
        clickBack();
        logger.info("Geçmiş Sekmelere Dönüş Sağlandı");
    }
}
