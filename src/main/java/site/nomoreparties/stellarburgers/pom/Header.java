package site.nomoreparties.stellarburgers.pom;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Header {

    private ElementsCollection headerLinks = $$(byClassName("AppHeader_header__linkText__3q_va ml-2"));
    private SelenideElement constructorButton = headerLinks.get(0);

    private SelenideElement ordersFeedButton = headerLinks.get(1);

    private SelenideElement stellarBurgersLink = $(byClassName("AppHeader_header__logo__2D0X2"));

    private SelenideElement profileLink = headerLinks.get(2);

    public void clickConstructorButton() {
        constructorButton.click();
    }

    public void clickOrdersFeedButton() {
        ordersFeedButton.click();
    }

    public void clickStellarBurgersLink() {
        stellarBurgersLink.click();
    }

    public void clickPersonalAreaLink() {
        profileLink.click();
    }
}
