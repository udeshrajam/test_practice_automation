package assessment.web.ui.pages;

import assessment.web.ui.utility.Constants;
import assessment.web.ui.utility.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class loginPage extends testBase {

    By lbl_loginHeader = By.xpath("//section[@id='login']/h2");
    By txtUsername = By.id("username");
    By txtPassword = By.id("password");
    By btnSubmit = By.id("submit");
    By toastMessage = By.id("error");

    public loginPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TimeOut));
    }

    public void loginPageHeader(String headerName) {
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(lbl_loginHeader));
        Assert.assertEquals(element.getText(), headerName);
    }

    public void userNameTextBox(String scenario) throws IOException {
        String username = null;
        switch (scenario.toLowerCase()) {
            case "valid" -> {
                username = Config().getProperty("username");
            }
            case "incorrect" -> {
                username = Config().getProperty("incorrectUsername");
            }
        }

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(txtUsername));
        element.sendKeys(username);
    }

    public void passwordTextBox(String scenario) throws IOException {
        String password = "";
        switch (scenario.toLowerCase()) {
            case "valid" -> {
                password = Config().getProperty("password");
            }
            case "incorrect" -> {
                password = Config().getProperty("incorrectPassword");
            }
        }
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword));
        element.sendKeys(password);
    }

    public void submitButton() {
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(btnSubmit));
        element.click();
    }


    public void fieldError(String error) {
        element = wait.until(ExpectedConditions.elementToBeClickable(toastMessage));
        Assert.assertEquals(element.getText(), error);
    }


}
