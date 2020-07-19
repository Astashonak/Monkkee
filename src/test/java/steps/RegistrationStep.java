package steps;

import pages.RegistrationPage;
import utils.Generator;

public class RegistrationStep {
    RegistrationPage registrationPage;
    Generator generator;

    public RegistrationStep(){
        registrationPage = new RegistrationPage();
        generator = new Generator();

    }

    public void fillFormForRegistrationANewUser(String email, String password){
        generator.generateRandomEmail();
        registrationPage.openPage();
        registrationPage.proceedRegistration(email, password);
    }
}
