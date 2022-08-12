package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class ShoppingTestovi extends BaseTest {
    public LoginPage loginPage;
    public HomePage  homePage;

    String email = "vudufrombelgrade@gmail.com";
    String password = "vuduvudu";
    String actualText = "$18.51";
    String expectedText = "$18.51";
    String orderPage = "http://automationpractice.com/index.php?controller=order";
    int numberOfAllItem = 7;
    

     @Test
    public void verifySuccesfulAddToCart(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(email, password);
        homePage.verifyProductAddedToCart();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void NumberOfItemPopular(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(email, password);
        homePage.numberOfProducts(numberOfAllItem);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
      
    @Test
    public void NumberOfItemBestSellers(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(email, password);
        homePage.numberOfProducts2(numberOfAllItem);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void verifyTotalPrice (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(email, password);
        homePage.verifyTotalPrice(expectedText);

    }



}
