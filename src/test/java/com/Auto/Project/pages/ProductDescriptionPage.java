package com.Auto.Project.pages;

import com.Auto.Project.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.fail;

public class ProductDescriptionPage extends DriverFactory {

    // Show more options
    @FindBy(css = "button[data-test='component-accordion-button-show-more']")
    public List<WebElement> showMoreButtons;

    //Review options includes Price, productName, Colour
    @FindBy(css = "span[class='Checkboxstyles__LabelValue-e3lxpy-6 fOQrQk']")
    public List<WebElement> filterOptionsElements;

    //Review customer Rating
    @FindBy(css = ".findability-facet__rating-label")
    public List<WebElement> customerRatingOptions;

    @FindBy(css = "strong[class='findability-facet__header']")
    public WebElement headerTitle;


    public void showMoreOptions() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("button[data-test='component-accordion-button-show-more']"), 3));

        for (WebElement showMore : showMoreButtons) {
            String availableText = showMore.getText();

            if (availableText.contains("Show more")) {
                showMore.click();
            }
        }
    }

    public void selectBrandOptions(String brand) {


        for (WebElement filterReview : filterOptionsElements) {
            String availableBrandText = filterReview.getText();
            sleep(3000);
            if (availableBrandText.equalsIgnoreCase(brand)) {
                filterReview.click();
                sleep(5000);
                break;

            }
        }
    }

        public void selectColourOptions(String colour){
                for (WebElement filterReview : filterOptionsElements) {
                    String availableColourText = filterReview.getText();
                    sleep(3000);
                if (availableColourText.equalsIgnoreCase(colour))
                filterReview.click();
                    sleep(5000);
                break;
            }
        }

    public List<WebElement> isProductAvailable() {
        List<WebElement> productWebElements = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        if (productWebElements.size() == 0) {
            fail("No Products found with: " + "BaByliss");
        }
        return productWebElements;
    }

    public void selectRatingOption(String ratingOption) {

        sleep(3000);
        for (WebElement starReview : customerRatingOptions) {
            String availableFilter = starReview.getText();

            if (availableFilter.equalsIgnoreCase(ratingOption)) {
                starReview.click();
            }
        }


    }
}