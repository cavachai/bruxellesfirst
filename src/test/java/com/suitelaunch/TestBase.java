package com.suitelaunch;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public abstract class TestBase {

    protected Injector injector = Guice.createInjector(new AbstractModule() {
        @Override
        protected void configure() {
            bind(Object.class);
        }
    });
}
