package com.Auto.Project.pages;

import com.Auto.Project.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverFactory {

    //price of individual product
    @FindBy(className = "div[class='ProductCardstyles__PriceContainer-l8f8q8-13 lcxskn']")
    private List<WebElement> priceOfProduct;

    //Title of individual product
    @FindBy(linkText = "a[data-test='component-product-card-title']")
    private List<WebElement> productTitle;

    //rating of individual product
    @FindBy(css = "div[data-test='component-ratings']")
    private List<WebElement> ratingStars;


    public List<String> getProductName() {

        List<String> productList = new ArrayList<>();

        for (WebElement title : productTitle) {
            String productTitle = title.getText();
            productList.add(productTitle);
        }
        return productList;


    }
}

