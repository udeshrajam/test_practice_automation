package steps;

import assessment.web.ui.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class login_steps {

    @Given("page header should display as {string}")
    public void pageHeaderShouldDisplayAs(String headerTitle) {
        new loginPage().loginPageHeader(headerTitle);
    }

    @When("enter {string} username")
    public void enter_username(String scenario) throws IOException {
        new loginPage().userNameTextBox(scenario);
    }

    @And("enter {string} password")
    public void enter_password(String scenario) throws IOException {
        new loginPage().passwordTextBox(scenario);
    }

    @And("click submit button")
    public void click_submit_button(){
        new loginPage().submitButton();
    }


    @Then("{string} error should display")
    public void valid_error_message(String error) {
        new loginPage().fieldError(error);
    }
}
