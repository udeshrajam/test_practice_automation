package assessment.web.ui.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.IOException;
import java.util.Objects;


public class BaseClass extends testBase {


    @Before(order = 0)
    public void openBrowser() throws IOException {
        switch (Config().getProperty("browser").toLowerCase()) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (Objects.equals(Config().getProperty("HeadlessMode"), String.valueOf(true))){
                    chromeOptions.addArguments("--headless");
                }
                driver = new ChromeDriver(chromeOptions);
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (Objects.equals(Config().getProperty("HeadlessMode"), String.valueOf(true))){
                    firefoxOptions.addArguments("--headless");
                }
                driver = new FirefoxDriver(firefoxOptions);
            }
        }
        System.out.println("Url -> " + Config().getProperty("url"));
        driver.get(Config().getProperty("url"));
        driver.manage().window().maximize();
    }

    @After
    public void quitBrowser() {
        driver.quit();
    }

}
