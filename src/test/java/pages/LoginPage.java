package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    WebDriver driver;

    By username = By.xpath("//textarea[@name='q']");
    By secrchBoxClick = By.xpath("//div[@class='a4bIc']");
    By loginBtn = By.xpath("//button//div[@class='u4Uk3c']");
    By successMsg = By.xpath("//b[text()='About this page']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void openLoginPage(){
        driver.get("https://www.google.com/");
    }

    public void login(String user){
        driver.findElement(username).click();

        driver.findElement(username).sendKeys(user);

        driver.findElement(username).sendKeys(Keys.ENTER);


        //driver.findElement(loginBtn).click();
    }

    public String getSuccessMessage(){
        String msg;
        try{
        msg =driver.findElement(successMsg).getText();
        }
        catch (Exception e){
            msg= "page";
        }
        return msg;
    }
}
