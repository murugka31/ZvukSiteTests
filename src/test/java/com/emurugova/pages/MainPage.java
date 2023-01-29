package com.emurugova.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement
            mainMenu =  $(".DesktopOnlyCss_ServerWrapper__4aOQ8"),
            tabHeading = $(".sc-1knim3b-0");

//Action methods
    public void openPage(){
        open("/");
    }

    public void openTab(String menuItem) {
        mainMenu.$(byText(menuItem)).click();
    }

//Check methods
    public MainPage checkMainMenu (String menuItem) {
        mainMenu.shouldHave(text(menuItem));
        System.out.println("Проверено: " + menuItem);
        return this;
    };
}
