package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    public LoginPage(WebDriver driver) {
    }

    @FindBy(xpath = "//input[@name = 'email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name = 'password']")
    private WebElement passwordInput;

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }
}
