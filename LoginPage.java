package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver){
        super(driver);
    }

    
    String baseUrl = "http://automationpractice.com/index.php";
    String LoginUrl = "http://automationpractice.com/index.php?controller=my-account";
      
    By emailBy = By.id("email");
    By passwordBy = By.id("passwd");
    By loginButtonBy = By.id("SubmitLogin");
    By homeButtonBy = By.xpath( "//*[@id='center_column']/ul/li/a");
    By errorContainerbBy = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]");
    By logOutContainerBy = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
    By LogOutButtonBy = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a");
    By expectedTextBy = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span");
    String errorText = "There is 1 error"; 

    public LoginPage basePage (){
        driver.get(baseUrl);
        driver.get(LoginUrl);
                return this;
     }
    
    public LoginPage login (String email, String password){
        writeText(emailBy, email);
        writeText(passwordBy, password);
        click(loginButtonBy);
        click(homeButtonBy);
        click (LogOutButtonBy);
        return this;
     }

    public LoginPage verifyUnsuccesfulLogin(String expectedText){
        String actualText = readText(errorContainerbBy);
        assertTextEquals(errorText, actualText);
        return this;
     }

     public LoginPage verifyEmptyUsernameLogin(String expectedText){
        String actualText = readText(errorContainerbBy);
        assertTextEquals(errorText, actualText);
        return this;
     }

     public LoginPage verifySuccesfulLogOut(String expectedLogOutText){
        String actualText = readText(errorContainerbBy);
        assertTextEquals(errorText, actualText);
        click(loginButtonBy);
        return this;
     }

}
    
