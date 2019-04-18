package com.gmail.actions;

import org.openqa.selenium.WebDriver;

public class NavigateAction {

    private WebDriver driver;

    public NavigateAction(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToBaseUrl() {
        driver.get("https://mail.google.com/");
    }
}
