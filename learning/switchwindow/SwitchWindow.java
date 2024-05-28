package dev.amankwah.linkedin.learning.switchwindow;

/*
 * 3 ways to switch Windows
 *
 * driver.switchTo().window(windowName)
 * driver.switchTo().frame("frameName")
 * driver.switchTo().alert();
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwitchWindow {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        openNewTab(driver);
        driver.quit();

    }
    private static void openNewTab(WebDriver driver){
        WebElement newtabButton= driver.findElement(By.id("new-tab-button"));
        newtabButton.click();


        String originalHandle= driver.getWindowHandle();
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.titleIs("Formy"));
        }
        driver.switchTo().window(originalHandle);


    }
}
