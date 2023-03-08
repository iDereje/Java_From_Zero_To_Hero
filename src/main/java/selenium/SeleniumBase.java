package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

    public class SeleniumBase {


        public ChromeDriver  seleniumInit(String url){
            System.out.println("Starting...");
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--start-maximized");
            options.setAcceptInsecureCerts(true);
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver(options);

            driver.get(url);
            return driver;
        }
        public void seleniumClose (ChromeDriver driver) {
            driver.close();
        }

    }

