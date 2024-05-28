package dev.amankwah.linkedin.learning.completeform;

import dev.amankwah.linkedin.learning.pages.ConfirmationPage;
import dev.amankwah.linkedin.learning.pages.FormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompleteFormDemo {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage= new FormPage(driver);
        formPage.submitForm();

        ConfirmationPage confirmationPage= new ConfirmationPage(driver);
        confirmationPage.waitForAlert();

        Assert.assertEquals("The form was successfully submitted!",confirmationPage.getAlertBanner());

        driver.quit();
    }


}
