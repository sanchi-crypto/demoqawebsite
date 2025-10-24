package com.demoqa.pages;
import com.demoqa.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver = DriverManager.getDriver();
    private By elementsCard = By.xpath("//h5[text()='Elements']");

    public void openElementsSection() {
        driver.findElement(elementsCard).click();
    }
}