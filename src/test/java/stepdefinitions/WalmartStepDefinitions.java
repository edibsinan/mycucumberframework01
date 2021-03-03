package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.scene.input.Dragboard;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class WalmartStepDefinitions {
    WalmartPage walmartPage=new WalmartPage();

    @When("kullanici Walmart ana sayfaya gider")
    public void kullanici_walmart_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("walmart_url"));
    }

    @Then("walmart sayfasinda {string} icin arama yapar")
    public void walmart_sayfasinda_icin_arama_yapar(String string) {
    walmartPage.walmartSearchBox.sendKeys(string+ Keys.ENTER);
    }

    @Then("walmartta sayfa basliginin {string} icerdigini test eder")
    public void walmartta_sayfa_basliginin_icerdigini_test_eder(String string) {
    Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

}
