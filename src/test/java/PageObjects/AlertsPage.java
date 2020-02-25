package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage{
    By jSAlertButton = By.cssSelector(".example li:nth-child(1) button");
    By jSConfirmButton = By.cssSelector(".example li:nth-child(2) button");
    By jSPromptButton = By.cssSelector(".example li:nth-child(3) button");



    public AlertsPage(WebDriver driver){
        //Used by class constructors to invoke constructors of its parent class.
        super(driver);
        visit("http://the-internet.herokuapp.com/javascript_alerts");
    }


    public void clickConfirmButton(){
        click(jSConfirmButton);
    }

    public void dismissConfirmAlert(){
        dealWithAlert();
    }



}
