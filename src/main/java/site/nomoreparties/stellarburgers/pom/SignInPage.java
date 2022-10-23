package site.nomoreparties.stellarburgers.pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    public static final String LOG_IN_PAGE_URL = ConstructorPage.MAIN_PAGE_URL + "/login";

    private SelenideElement signInLabel = $(byXpath(".//h2[text()='Вход']"));

    private SelenideElement emailField = $(byXpath(".//input[@class='text input__textfield text_type_main-default' and @type='text']"));

    private SelenideElement passwordField = $(byXpath(".//input[@class='text input__textfield text_type_main-default' and @type='password']"));

    private SelenideElement showPasswordButton = $(byXpath(".//div[@class='input__icon input__icon-action']"));

    private SelenideElement signInButton = $(byXpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']"));

    private SelenideElement newUserLabel = $(byXpath(".//p[@class='undefined text text_type_main-default text_color_inactive mb-4']"));

    private SelenideElement signUpLink = $(byXpath(".//a[text()='Зарегистрироваться']"));

    private SelenideElement forgetPasswordLabel = $(byXpath(".//p[@class='undefined text text_type_main-default text_color_inactive']"));

    private SelenideElement retrievePasswordLink = $(byXpath(".//a[text()='Восстановить пароль']"));

    public void enterEmail(String email) {
        emailField.setValue(email);
    }

    public void enterPassword(String password) {
        passwordField.setValue(password);
    }

    public void showPassword() {
        showPasswordButton.click();
    }

    public void clickLoginButton() {
        signInButton.click();
    }

    public void clickSignUpLink() {
        signUpLink.click();
    }

    public void clickRetrievePasswordLink() {
        retrievePasswordLink.click();
    }
}
