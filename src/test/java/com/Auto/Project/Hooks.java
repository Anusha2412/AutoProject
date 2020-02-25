package com.Auto.Project;

import drivers.DriverFactory;

public class Hooks {
    DriverFactory factory = new DriverFactory();

    public void setUp(){
        factory.openBrowser();
        factory.navigateTo("https://www.argos.co.uk/");
        factory.maxiBrowser();
        factory.applyImplicitWait();
    }

    public void tearDown(){
        factory.closeBrowser();
    }
}
