package com.Auto.Project.pages;

import com.Auto.Project.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TrolleyPage extends DriverFactory {

    @FindBy(css = "button[data-test='component-att-button']")
    public WebElement addToTrolley;

    @FindBy(css = "a[data-test='component-att-button-basket']")
    public WebElement goToTrolley;


    public void addToTrolley(){
        addToTrolley.click();
    }

    public void goToTrolley(){
        goToTrolley.click();
    }



    public void subTotalPrice(){
       String priceText =  driver.findElement(By.cssSelector("div[class='Summary__subTotalLabel__2GphY']")).getText();

       String value = priceText.replaceAll("£","");

       double price = Double.parseDouble(value);
    }


    public void selectDropDown(int indexNum){
        WebElement element = driver.findElement(By.cssSelector("select[class='ProductCard__quantitySelect__2y1R3']"));
        Select s1 = new Select(element);
        s1.selectByIndex(indexNum);
    }

}
