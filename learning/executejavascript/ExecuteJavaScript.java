package dev.amankwah.linkedin.learning.executejavascript;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Two methods used to execute javascript
 * executeAsyncScript():
 *        executes scripts asynchronously, must signal end of script by invoking callback
 *
 * executeScript():
 *         executes javascript as body of anonymous functions
 *
 * Uses:
 * When WebDriver fails to click on any element
 * To trigger actions on a page
 * To perform movement on a page
 */
public class ExecuteJavaScript {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton= driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeModalButton= driver.findElement(By.id("close-button"));

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",closeModalButton);

        driver.quit();
    }
}
