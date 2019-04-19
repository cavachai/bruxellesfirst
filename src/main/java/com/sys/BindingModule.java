package com.sys;

import com.gmail.actions.LoginAction;
import com.gmail.actions.NavigateAction;
import com.gmail.pages.LoginPage;
import com.google.inject.AbstractModule;

public class BindingModule extends AbstractModule {
    protected void configure() {
        bind(LoginPage.class);
        bind(LoginAction.class);
        bind(NavigateAction.class);
    }
}
