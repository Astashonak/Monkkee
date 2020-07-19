package steps;

import io.qameta.allure.Step;
import pages.RegistrationPage;
import utils.Generator;

public class RegistrationStep {
    RegistrationPage registrationPage;
    Generator generator;

    public RegistrationStep(){
        registrationPage = new RegistrationPage();
        generator = new Generator();

    }

    @Step("Открыть monkkee.com страницу регистрации")
    public RegistrationStep openRegistrationPage() {
        registrationPage.openPage();
        return this;
    }

    @Step("Заполнить форму регистрации")
    public RegistrationStep fillFormForRegistrationANewUser(String email, String password){
        generator.generateRandomEmail();
        registrationPage.proceedRegistration(email, password);
        return this;
    }

    @Step("Подтвердить регистрацию, получив сообщение о регистрации")
    public RegistrationStep confirmMessageOfRegistration() {
        registrationPage.confirmRegistration();
        return this;
    }
}
