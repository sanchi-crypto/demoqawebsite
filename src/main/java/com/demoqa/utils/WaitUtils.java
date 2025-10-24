package com.demoqa.utils;

import com.demoqa.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import java.time.Duration;

public class WaitUtils {

    private static WebDriver driver = DriverManager.getDriver();
    private static int explicitWait = Integer.parseInt(System.getProperty("explicit.wait", "15"));

    public static <T> T until(ExpectedCondition<T> condition, int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(condition);
    }

    public static <T> T until(ExpectedCondition<T> condition) {
        return new WebDriverWait(driver, Duration.ofSeconds(explicitWait)).until(condition);
    }
}