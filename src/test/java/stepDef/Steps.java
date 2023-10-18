package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.buy_object;

import static org.openqa.selenium.Keys.ENTER;

public class Steps extends Config {

    buy_object by = new buy_object();

    @Given("I am on the Macy's website")
    public void iAmOnTheMacySWebsite() {
        //verify the home page
        String exp ="Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com";
        String act = driver.getTitle();
        Assert.assertEquals(act, exp);

    }

    @When("I search for {string}")
    public void iSearchFor(String keyword) {
        by.searchForShoe(keyword, ENTER);


    }

    @And("I select a pair of men's shoes")
    public void iSelectAPairOfMenSShoes() {
        by.selectShoe();
        by.shoeColour();
        by.shoeSize();
        by.zipCode();
    }

    @And("I add the selected item to the cart")
    public void iAddTheSelectedItemToTheCart() {
        by.addCart();
    }

    @Then("the item should be in the cart")
    public void theItemShouldBeInTheCart() {
        by.goToCart();

    }
}
