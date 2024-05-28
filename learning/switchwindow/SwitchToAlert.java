package dev.amankwah.linkedin.learning.switchwindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class SwitchToAlert {
    private static WebDriver driver;

    public static void main(String[] args) {
        File file= new File("C:\\Users\\edmun\\IdeaProjects\\SeleniumDemo\\src\\main\\resources\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());

        driver= new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertButton= driver.findElement(By.id("alert-button"));
        alertButton.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert= driver.switchTo().alert();
        String alertMessage=alert.getText();
        alert.accept();

        System.out.println(alertMessage);
        driver.quit();
    }
}
