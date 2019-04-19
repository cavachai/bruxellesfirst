package com.di;

import com.google.inject.AbstractModule;
import com.suitelaunch.MyTest;
import com.sys.BindingModule;

public class TestModule extends AbstractModule {
    protected void configure() {
        install(new BindingModule());
        bind(MyTest.class);
    }
}
