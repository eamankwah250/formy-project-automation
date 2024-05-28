package dev.amankwah.linkedin.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    private static WebDriver driver;
    public FormPage(WebDriver _driver){
        driver= _driver;
    }

    public void submitForm(){
        WebElement firstName= driver.findElement(By.cssSelector("input#first-name"));
        firstName.sendKeys("Edmund");

        WebElement lastName= driver.findElement(By.cssSelector("input#last-name"));
        lastName.sendKeys("Amankwah");

        WebElement jobTitle= driver.findElement(By.cssSelector("input#job-title"));
        jobTitle.sendKeys("SDET");

        WebElement collegeRadioButton= driver.findElement(By.cssSelector("input[value=radio-button-2]"));
        collegeRadioButton.click();

        WebElement maleCheckBox= driver.findElement(By.cssSelector("input#checkbox-1"));
        maleCheckBox.click();

        WebElement experience2years= driver.findElement(By.cssSelector("option[value='2']"));
        experience2years.click();

        WebElement datepicker= driver.findElement(By.cssSelector("input#datepicker"));
        datepicker.sendKeys("05/29/2024");
        datepicker.sendKeys(Keys.RETURN);

        WebElement submitButton= driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary"));
        submitButton.click();
    }
}
