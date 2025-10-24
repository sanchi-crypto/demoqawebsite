package com.demoqa.pages;

import org.openqa.selenium.WebDriver;

import com.demoqa.driver.DriverManager;
import com.demoqa.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class TextBoxPage {

	private WebDriver driver = DriverManager.getDriver();

    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitButton = By.id("submit");

    // Output fields
    private By outputName = By.id("name");
    private By outputEmail = By.id("email");

    public TextBoxPage enterFullName(String name) {
        driver.findElement(fullName).clear();
        driver.findElement(fullName).sendKeys(name);
        return this;
    }

    public TextBoxPage enterEmail(String mail) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(mail);
        return this;
    }

    public TextBoxPage enterCurrentAddress(String address) {
        driver.findElement(currentAddress).clear();
        driver.findElement(currentAddress).sendKeys(address);
        return this;
    }

    public TextBoxPage enterPermanentAddress(String address) {
        driver.findElement(permanentAddress).clear();
        driver.findElement(permanentAddress).sendKeys(address);
        return this;
    }

    public TextBoxPage clickSubmit() {
        driver.findElement(submitButton).click();
        return this;
    }

    public void verifyOutput(String expectedName, String expectedEmail) {
        String actualName = driver.findElement(outputName).getText();
        String actualEmail = driver.findElement(outputEmail).getText();

        Assert.assertTrue(actualName.contains(expectedName), "Name not matching");
        Assert.assertTrue(actualEmail.contains(expectedEmail), "Email not matching");
    }
}