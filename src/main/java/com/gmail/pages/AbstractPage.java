package com.gmail.pages;

import com.driver.WebDriverContainer;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    public AbstractPage() {
        PageFactory.initElements(WebDriverContainer.getDriver(), this);
    }
}
