package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {


        LoginPage loginPage = new LoginPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        loginPage.openLoginPage();
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        loginPage.login("gold");

        Assert.assertTrue(
                loginPage.getSuccessMessage()
                        .contains("page")
        );
        System.out.println("git 1st push by hitesh");
    }
}
