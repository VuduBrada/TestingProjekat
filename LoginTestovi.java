package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestovi extends BaseTest{
public LoginPage loginPage;
public HomePage homePage;
String email = "vudufrombelgrade@gmail.com";
String password = "vuduvudu";
String expectedText = "Goran R. Vudu";
String errorEmail = "konjan@gmail.com";
String emptyUsername = "";
String errorText = "There is 1 error";
String emptyUsernameError = "There is 1 error";
String expectedLogOutText = "Sing In";


@Test

public void verifySuccesfulLogin(){
   LoginPage loginPage = new LoginPage(driver);
   HomePage homePage = new HomePage(driver);
   loginPage.basePage();
   loginPage.login("vudufrombelgrade@gmail.com", "vuduvudu");
   homePage.verifySuccesfulLogin(expectedText);

      try{
      Thread.sleep(5000);
      }
      catch(InterruptedException e){
         e.printStackTrace();
      }
}
@Test
public void verifyUnsuccesfulLogin(){
   LoginPage loginPage = new LoginPage(driver);
   loginPage.basePage();
   loginPage.login(errorEmail, password);
   loginPage.verifyUnsuccesfulLogin(errorEmail);


      try{
         Thread.sleep(5000);
      }
      catch(InterruptedException e){
         e.printStackTrace();
      }

   }


    
   @Test
public void verifyEmptyUsernameError(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(emptyUsername, password);
    loginPage.verifyEmptyUsernameLogin("There is 1 error");
    
    try{
        Thread.sleep(5000);
    }
    catch(InterruptedException e){
        e.printStackTrace();
      }
}

@Test
public void verifySuccesfulLogOut(){
   LoginPage loginPage = new LoginPage(driver);
   loginPage.basePage();
   loginPage.login(email, password);
   loginPage.verifySuccesfulLogOut(expectedText);

   try{
      Thread.sleep(5000);
   }
   catch(InterruptedException e){
      e.printStackTrace();
   }
}
   
}