package tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginTest{

    WebDriver driver;
    LoginPage loginPage;

    public LoginTest(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);

    }

    public void testAlertEmailMessage(String emailAlert){
        Assertions.assertEquals(emailAlert,loginPage.getAlertEmail());
    }
    public void testAlertPasswordMessage(String passwordAlert){
        Assertions.assertEquals(passwordAlert,loginPage.getAlertEmail());
    }
}
