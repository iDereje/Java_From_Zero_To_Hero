package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class GoogleTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        WebElement user = driver.findElement(By.id("user-name"));
        user.click();
        user.sendKeys("standard_user");
        WebElement pw = driver.findElement(By.id("password"));
        pw.click();
        pw.sendKeys("secret_sauce");
        WebElement login  = driver.findElement(By.id("login-button"));
        login.click();
        sleep(3000);
        driver.close();
    }
}
