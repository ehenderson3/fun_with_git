package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By userName = By.id("username");
    By password = By.id("password");
    By loginButton = By.cssSelector("button");
    By loginSuccessMessage = By.id("flash");


    public LoginPage(WebDriver driver){
        //Used by class constructors to invoke constructors of its parent class.
        super(driver);
        visit("http://the-internet.herokuapp.com/login");
    }


    public void login(String uN,String pW){
        type(uN,userName);
        type(pW,password);
        click(loginButton);
    }


    public String validateLogin(){
        var text = getText(loginSuccessMessage);
        return text;

    }


}
