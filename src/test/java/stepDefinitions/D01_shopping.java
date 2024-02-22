package stepDefinitions;//package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_shopping;

public class D01_shopping extends P01_shopping {

    @Given("I am on the eshop page firstly cancel cookies card")
    public void iAmOnTheEshopPageFirstlyCancelCookiesCard() {
        click_close();
    }

    @When("Click on one of the menu items")
    public void clickOnOneOfTheMenuItems() {
        select_the_item();
    }


    @And("I select the first item.")
    public void iSelectTheFirstItem() {
        click_on_item();

    }

    @And("and add it to the cart")
    public void add_it_to_the_cart() {
        add_the_item_to_the_cart();

    }

    @And("navigate to previous page")
    public void navigateToPreviousPage() {
        navigate_To_PreviousPage();
    }

    @And("add the second item to the cart")
    public void addTheSecondItemToTheCart() {
        add_The_Second_Item_ToTheCart();
    }

    @And("click on the add to cart button again")
    public void andAddTheSecondItemToTheCart() {
        add_to_the_cart_again();
    }

    @And("search for the third item")
    public void searchForTheThirdItem() {
        search_For_The_Third_Item();
    }

    @Then("add the third item to the cart")
    public void addTheThirdItemToTheCart() {
        add_The_Third_Item_To_The_Cart();
    }

}