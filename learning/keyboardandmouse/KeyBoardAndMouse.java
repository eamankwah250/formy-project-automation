package dev.amankwah.linkedin.learning.keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class KeyBoardAndMouse {
    private static WebDriver driver;

    public static void main(String[] args) {
        //set System.property
        File chromeDriver= new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",chromeDriver.getAbsolutePath());

        driver= new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement nameInput= driver.findElement(By.id("name"));
        WebElement button= driver.findElement(By.id("button"));

        nameInput.click();
        nameInput.sendKeys("Edmund");

        button.click();



        driver.quit();
    }
}
