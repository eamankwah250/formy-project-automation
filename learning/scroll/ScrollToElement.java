package dev.amankwah.linkedin.learning.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class ScrollToElement {
    private static WebDriver driver;

    public static void main(String[] args) {
        File chromedriver= new File("C:\\Users\\edmun\\IdeaProjects\\SeleniumDemo\\src\\main\\resources\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver",chromedriver.getAbsolutePath());

        driver= new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement nameField= driver.findElement(By.id("name"));
        WebElement dateField= driver.findElement(By.id("date"));

        Actions actions= new Actions(driver);
        //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));

        actions.moveToElement(nameField);
        nameField.sendKeys("Edmund Amankwah");
        dateField.sendKeys("01/02/2024");

        driver.quit();
    }
}
