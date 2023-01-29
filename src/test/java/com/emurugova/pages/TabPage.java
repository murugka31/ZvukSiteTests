package com.emurugova.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TabPage {

    private SelenideElement
    tabHeading = $(".sc-1knim3b-0");

//Check methods
    public TabPage checkTabPage (String tabItem) {
           tabHeading.shouldHave(text(tabItem));
           System.out.println("Проверено: " + tabItem);
           return this;
    };
}
