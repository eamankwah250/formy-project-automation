package dev.amankwah.linkedin.learning.Autocomplete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Autocomplete {
    private static WebDriver driver;

    public static void main(String[] args) {
        //Set up chromdriver
        File file= new File("C:\\Users\\edmun\\IdeaProjects\\SeleniumDemo\\src\\main\\resources\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());

        driver= new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocompleteAddres= driver.findElement(By.id("autocomplete"));

        autocompleteAddres.sendKeys("1555 Park Blvd, Palo Alto, CA");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dismissButton = driver.findElement(By.className("dismissButton"));
        dismissButton.click();

        driver.quit();
    }
}
