package site.nomoreparties.stellarburgers.pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PasswordRetrievalPage {
    public final static String PASSWORD_RETRIEVAL_PAGE_URL = ConstructorPage.MAIN_PAGE_URL + "/forgot-password";

    public final Header header = new Header();

    private SelenideElement passwordRetrievalLabel = $(byXpath(".//h2[text()='Восстановление пароля']"));

    private SelenideElement emailField = $(byXpath(".//input[@class='text input__textfield text_type_main-default']"));

    private SelenideElement retrieveButton = $(byXpath(".//button[text()='Восстановить']"));

    private SelenideElement rememberPasswordLabel = $(byXpath(".//p[@class='undefined text text_type_main-default text_color_inactive mb-4']"));

    private SelenideElement signInLink = $(byXpath(".//a[text()='Войти']"));
}
