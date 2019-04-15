package com.gmail.actions;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;

public class NavigateAction {

    private WebDriver driver;

    @Inject
    public NavigateAction(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToBaseUrl() {
        driver.get("https://mail.google.com/");
    }
}
