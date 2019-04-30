package com.suitelaunch;

import com.gmail.actions.LoginAction;
import com.gmail.actions.NavigateAction;
import com.google.inject.Inject;

public class MiddleMan {

    private NavigateAction navigateAction;
    private LoginAction loginAction;

    @Inject
    public MiddleMan(NavigateAction navigateAction, LoginAction loginAction) {
        this.navigateAction = navigateAction;
        this.loginAction = loginAction;
    }

    public void navigateToBaseUrl() {
        navigateAction.navigateToBaseUrl();
    }

    public void typeAndEnterCredential() {
        loginAction.typeEmail();
        loginAction.typePassword();
    }
}
