package tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import writingfeatures.LoginPage;

public class LoginTest{

    WebDriver driver;
    LoginPage loginPage;

    public LoginTest(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);

    }

    public void testLoginMessage(String message){
        Assertions.assertEquals(message,loginPage.getMsgInvalidCredentials());
    }
}
