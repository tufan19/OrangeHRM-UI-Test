package StepDefinitions;
import Pages.DialogContent;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Website")
    public void navigate_to_website() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.sendkeysFunc(dc.username,dc.findFromExcel("username"));
        dc.sendkeysFunc(dc.password,dc.findFromExcel("password"));
        dc.clickFunc(dc.loginButton);

    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.verifyLogin,"Dashboard");
    }
}
