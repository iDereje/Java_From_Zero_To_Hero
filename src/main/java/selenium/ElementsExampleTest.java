package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static java.lang.Thread.sleep;

public class ElementsExampleTest {
    public static void main(String[] args) throws InterruptedException {

        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.id("user-name"));
        WebElement pw = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));

        user.click();
        user.clear();
        user.sendKeys("standard_user");

        pw.click();
        pw.clear();
        pw.sendKeys("secret_sauce");

        login.click();

        WebElement price = driver.findElement(By.className("inventory_item_price"));
        String priceOfIem= price.getText();
        System.out.println("The price of item is "+priceOfIem);

       List<WebElement> prices =  driver.findElements(By.className("inventory_item_price"));
       for (WebElement priceToAnalyze:prices ){
           String pattern = priceToAnalyze.getText();
           System.out.println("price found "+pattern);

       }
        base.seleniumClose(driver);
    }
}
