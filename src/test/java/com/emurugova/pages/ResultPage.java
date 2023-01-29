package com.emurugova.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultPage {

    private SelenideElement
    searchField = $("#zvuk-search-input"),
    negativeResultField = $(".sc-lkpgla-0"),
    artistField = $(".sc-1ica110-0"),
    tabSearchResults = $(".sc-7uddu2-0");

//Action methods
    public void searchPositiveValue(String value){
       searchField.setValue(value).pressEnter();
    }
    public void searchNegativeValue(String value){
        searchField.setValue(value).pressEnter();
    }

//Check methods
    public ResultPage checkTabOnSearchResultsPage (String resultTab) {
        tabSearchResults.shouldHave(text(resultTab));
        System.out.println("Проверено: " + resultTab);
        return this;
};
    public ResultPage checkArtistResults (String artist) {
        artistField.shouldHave(text(artist));
        System.out.println("Проверено: " + artist);
        return this;
    };
    public ResultPage checkNegativeResults (String clue) {
        negativeResultField.shouldHave(text(clue));
        return this;
    };
}
