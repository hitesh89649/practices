package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.out.println("Setup running...");

        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--headless=new");
        opt.addArguments("--window-size=1920,1080");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(opt);


    }

    @AfterMethod
    public void tearDown() {
        if(driver != null){
            driver.quit();
        }
    }
}
