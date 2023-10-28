package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By fieldEmail = (By.id("email"));
    By fieldPassword = (By.id("password"));
    By alertEmail = (By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/span"));
    By alertPassword = (By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/span"));

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

    public String getAlertEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(alertEmail));
        String msg = driver.findElement(alertEmail).getText();
        return msg;
    }
    public String getAlertPassword(){
//        wait.until(ExpectedConditions.elementToBeClickable(alertEmail));
        String msg = driver.findElement(alertPassword).getText();
        return msg;
    }
    public  boolean isAlertPasswordVisible(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(alertPassword));
        }
        catch (TimeoutException exception){
            return  false;
        }
        return  true;
    }
}