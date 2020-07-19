package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.MailinatorPage;
import pages.RegistrationPage;
import steps.RegistrationStep;
import utils.Generator;

public class BaseTest {

   RegistrationStep registrationStep;
   Generator generator;


    @BeforeClass
    public void openBrowser() {
        Configuration.clickViaJs = true;
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        registrationStep = new RegistrationStep();
        generator = new Generator();


    }

    @AfterMethod
    public void closeBrowser()
    {
        Selenide.closeWebDriver();
    }
}
