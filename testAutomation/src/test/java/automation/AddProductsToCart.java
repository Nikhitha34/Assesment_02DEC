package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AddProductsToCart {

    @Test
    public void testSauceLabs(){
        String url ="https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

//Enter the Username
//1. Value 2. Locator
        By usernameLocator= By.id("user-name");
        WebElement usernameElement=driver.findElement(usernameLocator);
        usernameElement.sendKeys("standard_user");

        By passwordLocator= By.cssSelector("input[type='password']");
        WebElement passwordElement=driver.findElement(passwordLocator);
        passwordElement.sendKeys("secret_sauce");

        By loginbuttonLocator= By.xpath("//form/input[3]");
        WebElement loginbuttonElement=driver.findElement(loginbuttonLocator);
        loginbuttonElement.click();

        //By locator=By.cssSelector(".btn_primary.btn_inventory");
       // List<WebElement> elements=driver.findElements(locator);
        //System.out.print(elements.size());
        //String productName="Sauce Labs Bike Light";
        String actualTitle=driver.getTitle();
        String expectedTitle="Swag labs";
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didnot match");
        String productName="Sauce Labs Bike Light";
        String priceLocator = "//*[test()='Sauce Labs Bike Light']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']/div";
        String AddToCartLocator = "//*[test()='Sauce Labs Bike Light']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']/button";

        //By priceLoc=By.xpath(priceLocator);
        //WebElement elementPrice=driver.findElement(priceLoc);
        //String value=elementPrice.getText();
        //System.out.println(value);

        //By addToCart=By.xpath(AddToCartLocator);
        //WebElement elementAdd=driver.findElement(addToCart);
       // elementAdd.click();


    }
}