package site.nomoreparties.stellarburgers.pom;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProfilePage {

    public final Header header = new Header();

    private SelenideElement profileLink = $(byXpath(".//a[@class='Account_link__2ETsJ text text_type_main-medium text_color_inactive Account_link_active__2opc9']"));

    private ElementsCollection profileFields = $$(byXpath(".//a[@class='text input__textfield text_type_main-default input__textfield-disabled']"));
    private ElementsCollection editButtons = $$(byXpath(".//div[@class='input__icon input__icon-action']"));

    private SelenideElement nameField = profileFields.get(0);
    ;

    private SelenideElement nameEditButton = editButtons.get(0);

    private SelenideElement emailField = profileFields.get(1);

    private SelenideElement emailEditButton = editButtons.get(1);

    private SelenideElement passwordField = profileFields.get(2);

    private SelenideElement passwordEditButton = editButtons.get(2);

    private SelenideElement cancelLink = $(byClassName("button_button__33qZ0 button_button_type_secondary__3-tsA button_button_size_medium__3zxIa"));

    private SelenideElement saveButton = $(byClassName("button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa"));

    private SelenideElement ordersHistoryLink = $(byClassName("Account_link__2ETsJ text text_type_main-medium text_color_inactive"));

    private ElementsCollection ordersHistoryArea = $$(byXpath(".//a[@class='OrderHistory_link__1iNby']"));

    private SelenideElement signOutLink = $(byXpath(".//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']"));

    private SelenideElement infoLabel = $(byXpath(".//p[text()='В этом разделе вы можете изменить свои персональные данные']"));

    public void profileLinkClick() {
        profileLink.click();
    }

    public void nameEditButtonClick() {
        nameEditButton.click();
    }

    public void emailEditButtonClick() {
        emailEditButton.click();
    }

    public void passwordEditButtonClick() {
        passwordEditButton.click();
    }

    public void cancelLinkClick() {
        cancelLink.click();
    }

    public void saveButtonClick() {
        saveButton.click();
    }

    public void ordersHistoryLinkClick() {
        ordersHistoryLink.click();
    }

    public void signOutLinkClick() {
        signOutLink.click();
    }

    public void enterNameField(String input) {
        nameField.setValue(input);
    }

    public void enterEmailField(String input) {
        emailField.setValue(input);
    }

    public void enterPasswordField(String input) {
        passwordField.setValue(input);
    }

}
