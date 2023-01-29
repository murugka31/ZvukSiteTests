package com.emurugova.tests;

import com.emurugova.pages.MainPage;
import com.emurugova.pages.ResultPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.sleep;
import static com.emurugova.tests.TestData.*;
import static io.qameta.allure.Allure.step;

@Feature("Search")
public class SearchTests extends TestBase{

    MainPage mainPage = new MainPage();
    ResultPage resultPage = new ResultPage();

    @ValueSource(strings = {
            ALL_TAB,
            PLAYLISTS_TAB,
            ARTISTS_TAB ,
            ALBUMS_TAB,
            TRACKS_TAB,
            EPISODES_TAB
    })
    @Tag("SearchPageTest")
    @ParameterizedTest
    void pageOpeningWithResultsTest (String resultTab) {
        step("Open main page of Zvuk site", () -> {
            mainPage.openPage();
        });

        step("Type the Artist with results and search", () -> {
            resultPage.searchPositiveValue(TestData.ArtistValue);
            sleep(3000);
        });
        step("Check tabs on page with Results", () -> {
            resultPage.checkTabOnSearchResultsPage(resultTab);
        });
    }

     @Tag("SearchTest")
     @Test
     void searchArtistWithResultsTest () {
        step("Open main page of Zvuk site", () -> {
         mainPage.openPage();
        });

        step("Type the Artist with results and search", () -> {
            resultPage.searchPositiveValue(TestData.ArtistValue);
            sleep(3000);
        });
        step("Check that typed artist is in the Artist field", () -> {
            resultPage.checkArtistResults(ArtistValue);
        });
    }

    @Tag("SearchTest")
    @Test
    void searchArtistWithoutResultsTest (){
        step("Open main page of Zvuk site", () -> {
            mainPage.openPage();
        });

        step("Type the Artist without results and search", () -> {
            resultPage.searchNegativeValue(TestData.searchNegativeValue);
        });

        step("Check the page without results", () -> {
            resultPage.checkNegativeResults(TestData.searchNegativeResult);
        });
    }
}
