package com.suitelaunch;

import com.di.TestModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public abstract class TestBase {

    public TestBase() {
        final Injector injector = Guice.createInjector(new TestModule());
        injector.getInstance(MyTest.class);
    }
}
