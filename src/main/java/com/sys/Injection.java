package com.sys;

import com.gmail.actions.NavigateAction;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Injection {

    public Injection() {
        Injector guice = Guice.createInjector(new BindingModule());
        NavigateAction navigateAction = guice.getInstance(NavigateAction.class);

    }
}
