package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverContainer {

    private static WebDriver webDriver;

    private WebDriverContainer() {
    }

    public static WebDriver getDriver() {
        if (null == webDriver) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/web-drivers/win/chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return webDriver;
    }
}
