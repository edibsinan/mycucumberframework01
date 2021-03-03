package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DatatablesPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class DatatablesStepDefinition {

    DatatablesPage datatablesPage=new DatatablesPage();
    private WebDriver driver;


    @Given("kullanici datatable anasayfaya gider")
    public void kullanici_datatable_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("datatables_url"));
    }
    @Given("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
        datatablesPage.newbutton.click();
    }
    @Given("first name gonderirir")
    public void first_name_gonderirir() {
        datatablesPage.firstname.sendKeys("Veli");
    }





    @Given("last name gonderir")
    public void last_name_gonderir() {
        datatablesPage.lastname.sendKeys("Kan");
    }
    @Given("position girer")
    public void position_girer( ) {
        datatablesPage.position.sendKeys("Mudur");
    }
    @Given("office girer")
    public void office_girer() {
        datatablesPage.office.sendKeys("USA");
    }
    @Given("extention girer")
    public void extention_girer() {
        datatablesPage.extention.sendKeys("add");
    }
    @Given("start date girer")
    public void start_date_girer() {
            datatablesPage.date.sendKeys("2021-02-03");
    }
    @Given("salary girer")
    public void salary_girer() {
        datatablesPage.salary.sendKeys("1000");
    }
    @Given("create butonuna basar")
    public void create_butonuna_basar() {
        datatablesPage.create.click();
    }



}
