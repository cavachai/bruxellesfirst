package com.suitelaunch;

import com.driver.WebDriverContainer;
import org.junit.gen5.api.AfterAll;
import org.junit.gen5.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyTest extends TestBase {

    @BeforeAll
    public void setUp() {
//        injector.injectMembers(this);
    }

    @Test
    public void testSmth() {
        MiddleMan m = injector.getInstance(MiddleMan.class);
        m.navigateToBaseUrl();
        m.typeAndEnterCredential();
    }

    @Test
    public void testSmthElse() {
        MiddleMan m = injector.getInstance(MiddleMan.class);
        m.navigateToBaseUrl();
        m.typeAndEnterCredential();
    }

    @AfterAll
    public void tearDown() {
        WebDriverContainer.getDriver().quit();
    }
}
