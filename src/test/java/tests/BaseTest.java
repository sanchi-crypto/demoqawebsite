package tests;

import com.demoqa.config.ConfigReader;
import com.demoqa.driver.BrowserFactory;
import com.demoqa.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("=== Suite started ===");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("=== Before Test: preparing environment ===");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("=== Before Class: class-level setup ===");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("=== Browser launching ===");
        WebDriver driver = BrowserFactory.createDriver();
        DriverManager.setDriver(driver);
        driver.get(ConfigReader.get("base.url"));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        System.out.println("=== Closing browser ===");
        DriverManager.quitDriver();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("=== After Class: cleanup ===");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("=== After Test ===");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("=== Suite completed ===");
    }
}