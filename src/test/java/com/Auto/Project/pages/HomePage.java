package com.Auto.Project.pages;


import com.Auto.Project.drivers.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.security.Key;

public class HomePage extends DriverFactory {

    @FindBy(css = "input[data-test='search-input']")
    public WebElement searchBox;

    @FindBy(css = "input[data-test='search-button']" )
    public WebElement enterButton;


    public void doSearch(String item){
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void getCurrentUrl(){
        driver.getCurrentUrl();
    }
}
