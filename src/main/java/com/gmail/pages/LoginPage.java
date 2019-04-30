package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@type = 'email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type = 'password']")
    private WebElement passwordInput;

    @FindBy(id = "identifierNext")
    private WebElement emailNextButton;

    @FindBy(id = "passwordNext")
    private WebElement passwordNextButton;

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getEmailNextButton() {
        return emailNextButton;
    }

    public WebElement getPasswordNextButton() {
        return passwordNextButton;
    }
}
