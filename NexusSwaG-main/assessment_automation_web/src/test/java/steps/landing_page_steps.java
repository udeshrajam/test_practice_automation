package steps;

import assessment.web.ui.pages.landingPage;
import io.cucumber.java.en.Then;

public class landing_page_steps {


    @Then("valid header in landing page as {string}")
    public void validHeaderInLandingPageAs(String text) {
        new landingPage().pageHeader(text);
    }


    @Then("logout from app")
    public void logoutFromApp() {
        new landingPage().logoutButton();
    }


}
