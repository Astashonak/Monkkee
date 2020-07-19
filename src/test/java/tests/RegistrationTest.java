package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    String email;
    String password;

    @Test
    public void confirmRegistration (){
        email = generator.generateRandomEmail();
        password = generator.generateRandomPassword();
        registrationStep.fillFormForRegistrationANewUser(email, password);

    }

}
