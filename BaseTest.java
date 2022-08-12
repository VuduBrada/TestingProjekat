package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class BaseTest {

    public WebDriver driver;

    @Before

    public void setup(){
       System.setProperty ("webdriver.gecko.driver", "D:\\TESTING FOR QA PDF\\NoviProjekat\\NoviProjekat\\lib\\geckodriver.exe");
       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       //FirefoxOptions options = new FirefoxOptions();
       //options.setHeadless( true);
       //driver = new FirefoxDriver (options);


    }
    
    @After

    public void teardown(){
        driver.quit();
    }
}
