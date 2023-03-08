package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementsExample2 {
    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        List<WebElement> elements = driver.findElements(By.className("input_error"));
        WebElement user = elements.get(0);
        WebElement pw = elements.get(1);
        user.click();
        user.clear();
        user.sendKeys("standard_user");

        pw.click();
        pw.clear();
        pw.sendKeys("secret_sauce");
        base.seleniumClose(driver);
    }
}
