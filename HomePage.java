package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        super (driver);
    } 
    
    By HomePageTitleBy = By.id("my-account");
    By shoppingCartBy = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/b");
    By addToCartButton1 = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]/span");
    By numberOfItem = By.className("a.homefeatured");
    By numberOfItem2 = By.className("a.blockbestsellers");
    By totalPrice = By.xpath("//*[@id='total_price']");
   

    public HomePage verifySuccesfulLogin(String expectedText){
        String actualText = readText(HomePageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public HomePage verifyProductAddedToCart (){
        click(addToCartButton1);
        waitVisability(shoppingCartBy);
        return this;
    }

    public HomePage numberOfProducts (int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfItem);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;

    }

    public HomePage numberOfProducts2 (int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfItem2);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;

    }

    public HomePage verifyTotalPrice(String expectedText){
        click(addToCartButton1);
        waitVisability(totalPrice);
        return this;
        
    }

}
    
