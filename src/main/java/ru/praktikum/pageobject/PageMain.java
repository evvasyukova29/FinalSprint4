package ru.praktikum.pageobject;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ru.praktikum.config.ApplicationConfig.APP_URL;

public class PageMain {
    WebDriver webDriver;

    public PageMain(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    //Drop-down list (status of element accordion)
    private By firstAccordionHeading = By.xpath("//*[contains(@id, \"accordion__heading-0\")][@aria-expanded = \"true\"]");

    public void checkIsPresentAccordionZero()
    {
        boolean isDisplayed = webDriver.findElement(firstAccordionHeading).isEnabled();

    }
}

