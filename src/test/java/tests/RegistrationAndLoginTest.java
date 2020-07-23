package tests;

import io.qameta.allure.Link;
import org.testng.annotations.Test;

public class RegistrationAndLoginTest extends BaseTest {

    @Test(priority = 1, description = "Регистрация нового пользователя на сайте")
    @Link("https://my.monkkee.com/#/")
    public void registrationANewUser (){
        registrationStep
                .openRegistrationPage()
                .fillFormForRegistrationANewUser(email, password)
                .confirmMessageOfRegistration();
    }

    @Test(priority = 2, description = "Подтверждение регистрации по email")
    public void confirmMessageOnEmail (){
        mailinatorStep
                .openMailinatorPage()
                .goToEmailBox(email)
                .confirmRegistration();
    }

    @Test(priority = 3, description = "Авторизация пользователя на сайте")
    public void loginUser (){
        loginStep
                .openLoginPage()
                .fillFormForLogin(email, password)
                .confirmAuthorization();
    }
}
