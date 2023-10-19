package writingfeatures;

import io.cucumber.java.AfterAll;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    private static WebDriver driver = new ChromeDriver();
//    WebElement email = driver.findElement(By.id("email"));
//    WebElement password;
//    WebElement loginButton;
    public void navigateToLoginPage(){
        driver.get("https://front.serverest.dev/login");
    }
    public void fillFieldPassword(String password){

    }
//    public void fillFieldEmail(String email){
//        Actions action = new Actions(driver);
//        action.sendKeys(email);
//    }
//    public void hitLoginButton(){
//
//    }

    @AfterAll
    static void afterAll(){
        driver.close();
        driver.quit();
    }
}
