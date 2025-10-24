package tests;

import com.demoqa.driver.*;
import com.demoqa.pages.*;
import com.demoqa.utils.*;

import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test(description = "Verify Text Box form submission")
    public void testTextBoxForm() {
        // Navigate directly to Text Box page
        DriverManager.getDriver().get("https://demoqa.com/text-box");

        TextBoxPage tb = new TextBoxPage();
        tb.enterFullName("Sanchi Chawla")
          .enterEmail("sanchi@test.com")
          .enterCurrentAddress("Mumbai")
          .enterPermanentAddress("Delhi")
          .clickSubmit()
          .verifyOutput("Sanchi Chawla", "sanchi@test.com");
    }
}