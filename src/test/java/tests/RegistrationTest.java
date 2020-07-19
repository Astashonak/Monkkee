package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    String email;
    String password;

    @Test
    public void RegistrationANewUser (){
        email = generator.generateRandomEmail();
        password = generator.generateRandomPassword();
        registrationStep
                .openRegistrationPage()
                .fillFormForRegistrationANewUser(email, password)
                .confirmMessageOfRegistration();
    }
}
