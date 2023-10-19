package writingfeatures;

import io.cucumber.java.AfterAll;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private static WebDriver driver;
    private WebDriverWait wait;

    private Actions actions;
    public  LoginPage(){
       driver  = new ChromeDriver();
       wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       actions = new Actions(driver);
    }
    WebElement fieldEmail = driver.findElement(By.id("email"));
//    WebElement password;
//    WebElement loginButton;
    public void navigateToLoginPage(){
        driver.get("https://front.serverest.dev/login");
    }
    public void fillFieldPassword(String password){
    }
    public void fillFieldEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(fieldEmail));
        actions.sendKeys(email);
    }
//    public void hitLoginButton(){
//
//    }

    @AfterAll
    static void afterAll(){
        driver.close();
        driver.quit();
    }
}
