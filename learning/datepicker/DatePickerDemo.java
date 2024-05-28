package dev.amankwah.linkedin.learning.datepicker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datepicker= driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("05/29/2024");
        datepicker.sendKeys(Keys.RETURN);

        driver.quit();
    }
}
