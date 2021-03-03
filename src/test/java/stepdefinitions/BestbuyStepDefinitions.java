package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
public class BestbuyStepDefinitions {
    @When("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String kelime) {
        Driver.getDriver().get(ConfigReader.getProperty(kelime));
    }
    @Then("{string} de oldugunu test eder")
    public void deOldugunuTestEder(String istenenurl) {
        Assert.assertEquals(ConfigReader.getProperty(istenenurl),Driver.getDriver().getCurrentUrl());
    }
}
