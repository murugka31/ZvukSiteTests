package com.emurugova.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ZvukPage {

    private SelenideElement
            mainMenu =  $(".DesktopOnlyCss_ServerWrapper__4aOQ8"),
            tabHeading = $(".sc-1knim3b-0"),
            searchField = $("#zvuk-search-input"),
            negativeResultField = $(".sc-lkpgla-0"),
            artistField = $(".sc-1ica110-0"),
            tabSearchResults = $(".sc-7uddu2-0");

//Action methods
    public void openPage(){
        open("/");
    }

    public void openTab(String menuItem) {
        mainMenu.$(byText(menuItem)).click();
    }

    public void searchPositiveValue(String value){
        searchField.setValue(value).pressEnter();
    }

    public void searchNegativeValue(String value){
        searchField.setValue(value).pressEnter();
    }

//Check methods
    public ZvukPage checkMainMenu (String menuItem) {
        mainMenu.shouldHave(text(menuItem));
        System.out.println("Проверено: " + menuItem);
        return this;
    };

    public ZvukPage checkTabPage (String tabItem) {
        tabHeading.shouldHave(text(tabItem));
        System.out.println("Проверено: " + tabItem);
        return this;
    };

    public ZvukPage checkTabOnSearchResultsPage (String resultTab) {
        tabSearchResults.shouldHave(text(resultTab));
        System.out.println("Проверено: " + resultTab);
        return this;
    };

    public ZvukPage checkArtistResults (String artist) {
        artistField.shouldHave(text(artist));
        System.out.println("Проверено: " + artist);
        return this;
    };

    public ZvukPage checkNegativeResults (String clue) {
        negativeResultField.shouldHave(text(clue));
        return this;
    };
}
