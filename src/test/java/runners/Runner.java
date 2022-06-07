package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/feartures",
        glue="stepDefinitions",
        tags="@hmc",
        dryRun = true
)
public class Runner {


   /*
Bir framework'de bir  tek Runner class'i yeterli olabilir
Runner class'inda calss body'sinde hic bir sey olmaz
Runner class'imizi oneli yapan 2 adeta annotaion vardir.

feature:Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
glue: StepDefination dosyalarini nerede bulacagimizi gosterir
tags: o an hangi tagi calistirmak istiyorsak onu belli eder
@RunWith(Cucumber.class) notasyonu Runner class ina calisma ozelligi katar

Bu notasyon oldugu icin Cucumber framework'umuzda Junit kullanmayi tercih ediyoruz

dryRun:iki secnek var
dryRun= True yazdigimizda testimizi calistirmadan eksik adimları bize verir.
dryRun= false yazdigimizda testlerimiz calistirir.
 */
}