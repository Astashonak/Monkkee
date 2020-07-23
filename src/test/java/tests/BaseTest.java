package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import steps.LoginStep;
import steps.MailinatorStep;
import steps.RegistrationStep;
import utils.Generator;

public class BaseTest {

   RegistrationStep registrationStep;
   Generator generator;
   MailinatorStep mailinatorStep;
   LoginStep loginStep;

   String email;
   String password;

    @BeforeClass
    public void openBrowser() {
        Configuration.clickViaJs = true;
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        generator = new Generator();
        email = generator.generateRandomEmail();
        password = generator.generateRandomPassword();
        registrationStep = new RegistrationStep();
        mailinatorStep = new MailinatorStep();
        loginStep = new LoginStep();
    }

    @AfterMethod
    public void closeBrowser()
    {
        Selenide.closeWebDriver();
    }
}
