package com.Auto.Project;

import cucumber.api.java.Before;
import com.Auto.Project.drivers.DriverFactory;
import org.junit.AfterClass;

public class Hooks {
    DriverFactory factory = new DriverFactory();

@Before
    public void setUp(){
        factory.openBrowser();
        factory.navigateTo("https://www.argos.co.uk/");
        factory.maxiBrowser();
        factory.applyImplicitWait();
    }
@AfterClass
    public void tearDown(){
        factory.closeBrowser();
    }
}
