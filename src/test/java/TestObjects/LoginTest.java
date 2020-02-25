package TestObjects;

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

public class LoginTest {

    private LoginPage logIn;
    private WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/enriquehenderson/IdeaProjects/JavaSelenium/Vendor/chromedriver");
        driver = new ChromeDriver();
        logIn = new LoginPage(driver);
    }

    @Test
    public void logInSuccessfully(){
        logIn.login("tomsmith" , "SuperSecretPassword!" );
        var success = logIn.validateLogin();
        Assert.assertEquals(success,"You logged into a secure area!\n" +
                "×");
    }


    @Test
    public void logInLoop(){

        String[] users = { "bobhope", "lisa","larrybob","tomcruise" };

        for (String u: users) {
            logIn.login(u, "SuperSecretPassword!");
            var error = logIn.validateLogin();
            Assert.assertEquals(error, "Your username is invalid!\n" +
                    "×");
        }
    }


}


