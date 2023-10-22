package writingfeatures;

import io.cucumber.java.en.*;

public class LoginStepDefs {
    LoginPage loginPage;
    public LoginStepDefs(){
        loginPage = new LoginPage();
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

    @Then("I should see the {string} message")
    public void i_should_see_the_message(String result) {
    }
}
