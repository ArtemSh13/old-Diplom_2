package site.nomoreparties.stellarburgers.pom;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SignUpPage {
    public final static String SIGN_UP_PAGE_URL = ConstructorPage.MAIN_PAGE_URL + "/register";

    private SelenideElement registrationLabel = $(byXpath(".//h2[text()='Регистрация']"));

    private ElementsCollection registrationFields = $$(byXpath(".//input[@class='text input__textfield text_type_main-default']"));

    private SelenideElement nameField = registrationFields.get(0);

    private SelenideElement emailField = registrationFields.get(0);

    private SelenideElement passwordField = registrationFields.get(0);

    private SelenideElement showPasswordButton = $(byXpath(".//div[@class='input__icon input__icon-action']"));

    private SelenideElement registerButton = $(byXpath(".//button[text()='Зарегистрироваться']"));

    private SelenideElement alreadyRegisteredLabel = $(byXpath(".//p[@class='undefined text text_type_main-default text_color_inactive mb-4']"));

    private SelenideElement signInLink = $(byXpath(".//a[text()='Войти']"));
}
