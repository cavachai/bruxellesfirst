package com.suitelaunch;

import com.driver.WebDriverContainer;
import com.gmail.actions.LoginAction;
import com.gmail.actions.NavigateAction;
import com.google.inject.Inject;
import org.junit.gen5.api.AfterAll;
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
    }

    @AfterAll
    public void tearDown() {
        WebDriverContainer.getDriver().close();
    }
}
