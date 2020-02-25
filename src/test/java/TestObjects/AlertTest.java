package TestObjects;

import PageObjects.AlertsPage;
import PageObjects.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class AlertTest {

    private AlertsPage alert;
    private WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/enriquehenderson/IdeaProjects/JavaSelenium/Vendor/chromedriver");
        driver = new ChromeDriver();
        alert = new AlertsPage(driver);
    }

    @Test
    public void JavaScriptConfirmAlertTest(){
        alert.clickConfirmButton();
        alert.dismissConfirmAlert();
    }

    @Test
    public void GitAddTest(){
        alert.clickConfirmButton();
        alert.dismissConfirmAlert();
    }

    @Test
    public void FirstBranch(){
        alert.clickConfirmButton();
        alert.dismissConfirmAlert();
    }

    @Test
    public void CopyBranch(){
        alert.clickConfirmButton();
        alert.dismissConfirmAlert();
    }

}


