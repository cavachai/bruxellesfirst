package com.gmail.actions;

import com.gmail.pages.LoginPage;
import com.google.inject.Inject;
import org.openqa.selenium.Keys;

public class LoginAction {

    private LoginPage loginPage;

    @Inject
    public LoginAction(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void typeEmail() {
        loginPage.getEmailInput().sendKeys("epamtestmail2@gmail.com", Keys.ENTER);
    }

    public void typePassword() {
        loginPage.getPasswordInput().sendKeys("mypass", Keys.ENTER);
    }
}
