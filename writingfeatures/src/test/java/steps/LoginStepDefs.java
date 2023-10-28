package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import tests.LoginTest;
import utils.Hooks;
import utils.WebDriverFactory;

public class LoginStepDefs {
    LoginPage loginPage;
    WebDriver driver;

    Hooks hooks;

    LoginTest loginTest;
    public LoginStepDefs(){
        driver = WebDriverFactory.createWebDriver();
        loginPage = new LoginPage(driver);
        loginTest = new LoginTest(driver);
        hooks = new Hooks(driver);
    }

    @Given("I access the login page")
    public void i_access_the_login_page() {
        loginPage.navigateToLoginPage();
    }
    @When("I fill the email field with {string}")
    public void i_fill_the_email_field_with(String email) {
        loginPage.fillFieldEmail(email);
    }
    @When("I fill the password field with {string}")
    public void i_fill_the_password_field_with(String password) {
       loginPage.fillFieldPassword(password);
    }
    @Then("I should see the  message")
    public void i_should_see_the_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I hit the button login")
    public void i_hit_the_button_login() {
        loginPage.clickLoginButton();
    }

    @Then("I should see the email alert {string}")
    public void i_should_see_the_email_alert(String emailAlert) {
        loginTest.testAlertEmailMessage(emailAlert);
    }
    @Then("I should see the password alert {string}")
    public void i_should_see_the_password_alert(String passwordAlert) {
        loginTest.testAlertPasswordMessage(passwordAlert);
    }
    @After
    public  void afterScenario(){
         hooks.afterScenario();
    }
}
