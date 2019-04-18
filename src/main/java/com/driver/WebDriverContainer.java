package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverContainer {

    private static WebDriver webDriver;

    private WebDriverContainer() {}

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/web-drivers/win/chromedriver.exe");
        webDriver = new ChromeDriver();
        return webDriver;
    }
}
