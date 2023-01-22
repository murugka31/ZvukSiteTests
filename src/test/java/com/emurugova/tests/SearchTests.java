package com.emurugova.tests;

import com.emurugova.pages.ZvukPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.sleep;
import static com.emurugova.tests.TestData.*;
import static io.qameta.allure.Allure.step;

@Feature("Search")
public class SearchTests extends TestBase{

    ZvukPage zvukPage = new ZvukPage();
    @ValueSource(strings = {
            ALL_TAB,
            PLAYLISTS_TAB,
            ARTISTS_TAB ,
            ALBUMS_TAB,
            TRACKS_TAB,
            EPISODES_TAB
    })
    @ParameterizedTest
    void pageOpeningWithResultsTest (String resultTab) {
        step("Open main page of Zvuk site", () -> {
            zvukPage.openPage();
        });

        step("Type the Artist with results and search", () -> {
            zvukPage.searchPositiveValue(TestData.ArtistValue);
            sleep(3000);
        });
        step("Check tabs on page with Results", () -> {
            zvukPage.checkTabOnSearchResultsPage(resultTab);
        });
    }

     @Test
     void searchArtistWithResultsTest () {
        step("Open main page of Zvuk site", () -> {
         zvukPage.openPage();
        });

        step("Type the Artist with results and search", () -> {
            zvukPage.searchPositiveValue(TestData.ArtistValue);
            sleep(3000);
        });
        step("Check that typed artist is in the Artist field", () -> {
            zvukPage.checkArtistResults(ArtistValue);
        });
    }

    @Test
    void searchArtistWithoutResultsTest (){
        step("Open main page of Zvuk site", () -> {
            zvukPage.openPage();
        });

        step("Type the Artist without results and search", () -> {
            zvukPage.searchNegativeValue(TestData.searchNegativeValue);
        });

        step("Check the page without results", () -> {
            zvukPage.checkNegativeResults(TestData.searchNegativeResult);
        });
    }
}
