package assessment.web.ui.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class testBase {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebElement element;
    public static String value;



    public Properties Config() throws IOException {
        Properties prop = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
        prop.load(fileInputStream);
        return prop;
    }


}
