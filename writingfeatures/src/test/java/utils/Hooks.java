package utils;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

   public Hooks(WebDriver driver){
        this.driver = driver;
    }
    public  void afterScenario(){
        driver.close();
        driver.quit();
    }
}
