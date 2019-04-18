package com.sys;

import com.gmail.pages.LoginPage;
import com.google.inject.AbstractModule;

public class Binding extends AbstractModule {
    protected void configure() {
        bind(LoginPage.class).to(LoginPage.class);

    }
}
