package com.Auto.Project.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.Auto.Project.pages.HomePage;
import com.Auto.Project.pages.ProductDescriptionPage;


public class Search {

    private HomePage homePage= new HomePage();
    private ProductDescriptionPage descriptionPage = new ProductDescriptionPage();


    @Given("^I am on home page$")
    public void i_am_on_home_page()  {
        homePage.getCurrentUrl();
    }
    @Given("^I look for product \"([^\"]*)\"$")
    public void i_look_for_product(String searchTerm)  {
        homePage.doSearch(searchTerm);
        descriptionPage.showMoreOptions();
    }

    @Given("^Brand \"([^\"]*)\"$")
    public void brand(String brand)  {
        descriptionPage.selectBrandOptions(brand);

    }

    @Given("^Colour \"([^\"]*)\"$")
    public void colour(String colour) {
        descriptionPage.selectColourOptions(colour);

    }



    @When("^rating review \"([^\"]*)\"$")
    public void rating_review(String rating) {
        descriptionPage.selectRatingOption(rating);
    }

    @When("^I apply filters of price review \"([^\"]*)\"$")
    public void i_apply_filters_of_price_review(String price) {


    }

    @Then("^I should be able to see all related products$")
    public void i_should_be_able_to_see_all_related_products() throws Throwable {

    }
}
