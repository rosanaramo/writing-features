package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.function.Try;
import org.openqa.selenium.NoSuchElementException;
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
            if (loginPage.isAlertPasswordVisible()){
                Assertions.assertEquals(passwordAlert, loginPage.getAlertPassword());
            }else{
                System.out.println("Alert message of field password should not appear at this point");
        }
    }
}
