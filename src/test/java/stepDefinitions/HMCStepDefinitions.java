package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCStepDefinitions {
    HMCPage hmcPage=new HMCPage();


    @Then("Login yazisina tiklar")
    public void login_yazisina_tiklar() {
        hmcPage.loginButonu.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu2.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.loginButonu2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }


    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {

        hmcPage.usernameKutusu.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hmcPage.passwordKutusu.sendKeys(password);
    }


    @Given("kullanici Hotel My Camp ana sayfasinda")
    public void kullaniciHotelMyCampAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


    @Given("kullanici {string} ile siteye giris yapar")
    public void kullaniciIleSiteyeGirisYapar(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @And("Login butonuna tiklar")
    public void loginButonunaTiklar() {
        hmcPage.loginButonu2.click();
    }


    @Then("gecersiz {string} girer")
    public void gecersizGirer(String arg0) {
    }
}