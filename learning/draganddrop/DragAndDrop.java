package dev.amankwah.linkedin.learning.draganddrop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
 * Great for:
 *  - Moving or manipulating images
 *  - Arranging components on the screen
 */
public class DragAndDrop {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image= driver.findElement(By.id("image"));
        WebElement box= driver.findElement(By.id("box"));
        WebElement boxText= driver.findElement(By.xpath("/html/body/div/div[2]/p"));

        Actions actions= new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(boxText,"Dropped!"));


        driver.quit();
    }
}
