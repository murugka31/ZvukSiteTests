package com.emurugova.tests;

import com.emurugova.pages.ZvukPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.emurugova.tests.TestData.*;
import static io.qameta.allure.Allure.step;

@Feature("Main page test")
public class TestsForMainPage extends TestBase {

    ZvukPage zvukPage = new ZvukPage();
    @ValueSource(strings = {
            MAIN_NAME,
            WAVE_NAME,
            TOP_NAME,
            NEW_PRODUCTS_NAME,
            PLAYLISTS_NAME,
            GENRES_NAME,
            PODCASTS_NAME,
            FOR_KIDS_NAME,
            AUDIOBOOKS_NAME,
            RADIO_NAME,
            LIVE_CONCERT_NAME
    })
    @Tag("properties")
    @ParameterizedTest (name = "Check tab for main menu of Zvuk Site: {0}")
    void mainPageOpeningTest (String menuItem){
    step("Open main page of Zvuk site", () -> {
        zvukPage.openPage();
    });

    step("Check the main page", () -> {
        zvukPage.checkMainMenu(menuItem);
    });
    }
}






