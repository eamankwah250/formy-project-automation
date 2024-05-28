package dev.amankwah.linkedin.learning.radiobuttons;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class RadioButtonsDemo {
    private static WebDriver driver;

    public static void main(String[] args) {
        File file= new File("src/main/resources/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());

        driver= new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1= driver.findElement(By.cssSelector("#radio-button-1"));
        radioButton1.click();

        WebElement radioButton2= driver.findElement(By.cssSelector("input[value=option2]"));
        radioButton2.click();

        WebElement radioButton3= driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        driver.quit();
    }
}
