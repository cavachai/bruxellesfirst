package com.gmail.actions;

import com.driver.WebDriverContainer;
import org.openqa.selenium.WebDriver;

public class NavigateAction {

    private WebDriver driver = WebDriverContainer.getDriver();

    public void navigateToBaseUrl() {
        driver.get("https://mail.google.com/");
    }
}
