package selenium.pageObjectExample.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import selenium.pageObjectExample.pages.LoginPage;
import selenium.pageObjectExample.pages.ProdPage;

public class TestLogin {

    public static void main(String[] args) {

      selenium.SeleniumBase base = new selenium.SeleniumBase();
      ChromeDriver driver = base.seleniumInit("https://www.google.com");
      ProdPage prodPage = new ProdPage(driver);
      LoginPage loginPage = new LoginPage(driver);





    }

}
