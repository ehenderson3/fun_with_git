package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {this.driver = driver;}

    public void visit(String url) {
        if (url.contains("http")){
            driver.get(url);
        } else {
            //driver.get(baseUrl + url);
        }
    }

    /**
     * finds a single element using the Selenium's findElement
     * @param locator
     * @return */
    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    /**
     * finds single element using the Selenium's findElement and clicking element using the seleinium's click method
     * @param locator
     */

    public void click(By locator) {
        find(locator).click();
    }

    /**
     * inputs text(inputText)into field element(locator)
     *  @param inputText
     *  @param locator */
    public void type(String inputText, By locator) {
        find(locator).sendKeys(inputText);
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public String getText(By locator){
        WebElement txtBoxContent = driver.findElement(locator);
        String textValue = new String();
        textValue = txtBoxContent.getText();
        return textValue;
    }

    public void dealWithAlert(){
        Alert popup = driver.switchTo().alert();
        popup.accept();
    }


}


