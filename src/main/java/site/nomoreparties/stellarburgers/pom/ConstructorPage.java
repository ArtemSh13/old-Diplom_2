package site.nomoreparties.stellarburgers.pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ConstructorPage {
    public static final String MAIN_PAGE_URL = "https://stellarburgers.nomoreparties.site/";

    public final Header header = new Header();

    private SelenideElement assembleBurgerLabel = $(byClassName("text text_type_main-large mb-5 mt-10"));

    private SelenideElement bunsTab = $(byXpath(".//span[text()='Булки']"));

    private SelenideElement saucesTab = $(byXpath(".//span[text()='Соусы']"));

    private SelenideElement stuffingTab = $(byXpath(".//span[text()='Начинки']"));

    private SelenideElement bunsHeader = $(byXpath(".//h2[text()='Булки']"));

    private SelenideElement bunsArea = $$(byClassName("BurgerIngredients_ingredients__list__2A-mT")).get(0);

    private SelenideElement saucesHeader = $(byXpath(".//h2[text()='Соусы']"));

    private SelenideElement saucesArea = $$(byClassName("BurgerIngredients_ingredients__list__2A-mT")).get(1);

    private SelenideElement stuffingHeader = $(byXpath(".//h2[text()='Начинки']"));

    private SelenideElement stuffingArea = $$(byClassName("BurgerIngredients_ingredients__list__2A-mT")).get(2);

    private SelenideElement burgerConstructorArea = $(byClassName("BurgerConstructor_basket__list__l9dp_"));

    private SelenideElement totalLabel = $(byClassName("text text_type_digits-medium mr-3"));

    private SelenideElement signInOrOrderButton = $(byClassName("button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg"));

    public void clickBunsTab() {
        bunsTab.click();
    }

    public void clickSaucesTab() {
        saucesTab.click();
    }

    public void clickStuffingTab() {
        stuffingTab.click();
    }

    public int getTotal() {
        return Integer.parseInt(totalLabel.getText());
    }

    public boolean isSignedIn() {
        return signInOrOrderButton.getText().equals("Оформить заказ");
    }

    public void clickSignInOrOrderButton() {
        signInOrOrderButton.click();
    }

}
