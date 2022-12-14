package site.nomoreparties.stellarburgers.pom;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SignUpPage {
    public final static String SIGN_UP_PAGE_URL = ConstructorPage.MAIN_PAGE_URL + "/register";

    public final Header header = new Header();

    private SelenideElement registrationLabel = $(byXpath(".//h2[text()='Регистрация']"));

    private ElementsCollection registrationFields = $$(byXpath(".//input[@class='text input__textfield text_type_main-default']"));

    private SelenideElement nameField = registrationFields.get(0);

    private SelenideElement emailField = registrationFields.get(1);

    private SelenideElement passwordField = registrationFields.get(2);

    private String incorrectPasswordLabelXpath = ".//p[text()='Некорректный пароль']";

    private SelenideElement showPasswordButton = $(byXpath(".//div[@class='input__icon input__icon-action']"));

    private SelenideElement signUpButton = $(byXpath(".//button[text()='Зарегистрироваться']"));

    private String alreadySignedUpLabelXpath = ".//p[@class='undefined text text_type_main-default text_color_inactive mb-4']";

    private SelenideElement signInLink = $(byXpath(".//a[text()='Войти']"));

    public void enterName(String name) {
        nameField.setValue(name);
    }

    public void enterEmail(String email) {
        emailField.setValue(email);
    }

    public void enterPassword(String password) {
        passwordField.setValue(password);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public boolean isPasswordCorrect() {
        return !($(byXpath(incorrectPasswordLabelXpath)).exists());
    }

    public boolean isUserAlreadySignedUp() {
        return $(byXpath(alreadySignedUpLabelXpath)).exists();
    }

    public void signUp(String name, String email, String password) {
        enterName(name);
        enterEmail(email);
        enterPassword(password);
        clickSignUpButton();
    }

}
