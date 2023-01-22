package com.emurugova.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.emurugova.config.AppConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.emurugova.helpers.AllureAttachments;

import static com.emurugova.tests.TestData.*;
import static java.lang.String.format;

public class TestBase {

    public static AppConfig config = ConfigFactory.create(AppConfig.class, System.getProperties());

    @BeforeAll
    static void beforeAll(){
        String browserSize = System.getProperty("browserSize", "2100x1080");
        String browser = System.getProperty("browser", "chrome");
        String browserVersion = System.getProperty("browserVersion", "100");

        String remoteUrl = System.getProperty("remoteUrl", config.remoteUrl());
        String login = config.remoteUrlLogin();
        String password = config.remoteUrlPassword();

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo",true);

        Configuration.browserCapabilities = capabilities;
        Configuration.browserSize = browserSize;
        Configuration.browser = browser;
        Configuration.browserVersion = browserVersion;
        Configuration.baseUrl = baseURL;
        Configuration.remote = format("https://%s:%s@%s", login, password, remoteUrl);
    }
    @AfterEach
    public void attachMethods() {
        AllureAttachments.screenshotAs("Last screenshot");
        AllureAttachments.pageSource();
        AllureAttachments.browserConsoleLogs();
        AllureAttachments.addVideo();
    }
}
