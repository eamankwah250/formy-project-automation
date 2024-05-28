package dev.amankwah.linkedin.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationPage {
    private static WebDriver driver;
    public ConfirmationPage(WebDriver _driver){
        driver= _driver;
    }
    public void waitForAlert(){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://formy-project.herokuapp.com/thanks"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

    }
    public  String getAlertBanner(){
        String text=driver.findElement(By.className("alert")).getText();
        return text;
    }
}
