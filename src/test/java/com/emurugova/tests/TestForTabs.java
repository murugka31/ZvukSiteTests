package com.emurugova.tests;

import com.emurugova.pages.ZvukPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static com.emurugova.tests.TestData.*;
import static io.qameta.allure.Allure.step;

public class TestForTabs extends TestBase {

    ZvukPage zvukPage = new ZvukPage();

    static Stream<Arguments> tabOpeningTest () {
        return Stream.of(
                Arguments.of(
                        MAIN_NAME, MAIN_HEADING
                ),
                Arguments.of(
                        WAVE_NAME, WAVE_HEADING
                ),
                Arguments.of(
                        TOP_NAME, TOP_HEADING
                ),
                Arguments.of(
                        NEW_PRODUCTS_NAME, NEW_PRODUCTS_HEADING
                ),
                Arguments.of(
                        PLAYLISTS_NAME, PLAYLISTS_HEADING
                ),
                Arguments.of(
                        GENRES_NAME, GENRES_HEADING
                ),
                Arguments.of(
                        PODCASTS_NAME, PODCASTS_HEADING
                ),
                Arguments.of(
                        FOR_KIDS_NAME, FOR_KIDS_HEADING
                ),
                Arguments.of(
                        AUDIOBOOKS_NAME, AUDIOBOOKS_HEADING
                )
        );
    }

    @MethodSource()
    @ParameterizedTest(name = "Check the heading of tab page: {0}")
    void tabOpeningTest (String menuItem, String tabItem){
        step("Open main page of Zvuk site", () -> {
            zvukPage.openPage();
        });

        step("Open the tab in main menu", () -> {
            zvukPage.openTab(menuItem);
        });

        step("Check the tab page", () -> {
            zvukPage.checkTabPage(tabItem);
        });
    }
}
