package assessment.web.ui.pages.pages;

import assessment.web.ui.utility.Constants;
import assessment.web.ui.utility.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class landingPage extends testBase {

    By lbl_Header = By.xpath("//div[@id='loop-container']/div/article/div/h1");
    By btn_logout = By.xpath("//a[contains(text(),'Log out')]");


    public landingPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TimeOut));
    }

    public void pageHeader(String headerText) {
        element = wait.until(ExpectedConditions.elementToBeClickable(lbl_Header));
        Assert.assertEquals(element.getText(), headerText);
    }

    public void logoutButton() {
        element = wait.until(ExpectedConditions.elementToBeClickable(btn_logout));
        element.click();
    }


}
