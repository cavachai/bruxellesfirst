package com.gmail.actions;

import com.driver.WebDriverContainer;
import com.gmail.pages.LoginPage;
import com.google.inject.Inject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.beans.Visibility;

public class LoginAction {

    private LoginPage loginPage;

    @Inject
    public LoginAction(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void typeEmail() {
        loginPage.getEmailInput().sendKeys("epamtestmail2@gmail.com", Keys.ENTER);
        FluentWait<WebDriver> elementFluentWait = new FluentWait<WebDriver>(WebDriverContainer.getDriver()).until(e -> !loginPage.getEmailInput().isDisplayed());
//        loginPage.getEmailNextButton().click();
    }

    public void typePassword() {

        loginPage.getPasswordInput().sendKeys("epam1993", Keys.ENTER);
//        loginPage.getPasswordNextButton().click();
    }
}
