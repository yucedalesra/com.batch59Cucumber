package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumber'da step definitions package'i icerisinde
     @before @after gibi notasyonlar varsa
    extends TestBase dememize gerek kalmadan
    her senaryodan önce ve/veya sonra bu method'lar calisacaktir

    Bu da bizim isteyecegimiz bir durum degildir

    Cucumber'da @before, @after kullanma ihtiyacimiz olursa
    bunu stepdefinitions package'i altinda olusturacagimiz
    hooks class'ina koyariz


   Bize her senaryo'dan sonra test sonucunu kontrol edip
   failed olan senaryolar icin
   screenshot almasi amaciyla
   @After methodu kullanacagiz
     */

    @After
    public void tearDown(Scenario scenario){

        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        //Driver.closeDriver();
    }

}
