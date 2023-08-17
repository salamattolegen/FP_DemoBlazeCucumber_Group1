package StepsDefinitions;

import Pages.ProjectElements;
import Utilities.BaseDriverDemoBlaze;
import Utilities.ProjectMethods;
import io.cucumber.java.en.*;;

public class LoginSteps extends ProjectMethods {
    ProjectElements pe = new ProjectElements();

    @Given("Navigate to DemoBlaze")
    public void navigateToDemoBlaze() {
        BaseDriverDemoBlaze.getDriver().get("https://www.demoblaze.com/index.html");
    }

    @When("We enter {string} as a username and {string} as a password")
    public void weEnterAsAUsernameAndAsAPassword(String userName, String passWord) {
        pe.clickMethod(pe.loginLink);
        pe.sendKeysMethod(pe.userName, userName);
        pe.sendKeysMethod(pe.password, passWord);
    }

    @And("Click on Login")
    public void clickOnLogin() {
        pe.clickMethod(pe.loginButton);
    }


    @Then("Should login successfully")
    public void shouldLoginSuccessfully() {
        pe.assertLogin(pe.verification, "Welcome");
    }


}