package writingfeatures;

import io.cucumber.java.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private static WebDriver driver;
    private WebDriverWait wait;

    public  LoginPage(){
       driver  = new ChromeDriver();
       wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    By fieldEmail = (By.id("email"));
    By fieldPassword = (By.id("password"));
    By msgInvalidCredentials = (By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/span"));

    By buttonLogin = (By.xpath("//*[@id=\"root\"]//button"));
    public void navigateToLoginPage(){
        driver.get("https://front.serverest.dev/login");
    }
    public void fillFieldPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(fieldPassword));
        driver.findElement(fieldPassword).sendKeys(password);
    }
    public void fillFieldEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(fieldEmail));
        driver.findElement(fieldEmail).sendKeys(email);
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonLogin));
        driver.findElement(buttonLogin).click();
    }

    public String getMsgInvalidCredentials(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(msgInvalidCredentials)));
        String msg = driver.findElement(msgInvalidCredentials).getText();
        return msg;
    }

    @After
    static void after(){
        driver.close();
        driver.quit();
    }
}
