package com.suitelaunch;

import com.gmail.actions.LoginAction;
import com.gmail.actions.NavigateAction;
import com.google.inject.Inject;
import org.junit.jupiter.api.Test;

public class MyTest {

    private NavigateAction navigateAction;
    private LoginAction loginAction;

    @Inject
    public MyTest(NavigateAction navigateAction, LoginAction loginAction) {
        this.navigateAction = navigateAction;
        this.loginAction = loginAction;
    }

    @Test
    public void testSmth() {
        navigateAction.navigateToBaseUrl();
        loginAction.typeEmail();
        loginAction.typePassword();
    }
}
