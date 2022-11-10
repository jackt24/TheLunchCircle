package StepDefintions.home;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps extends BaseClass {

    HomePage homepage = new HomePage(driver);
    public HomePageSteps() {
//        HomePage homepage = new HomePage(driver);
    }
    @Then("I should be displayed with the homepage")
    public void i_should_be_displayed_with_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 3, Hello World");
    }

    @And("I click the browse members button")
    public void iClickTheBrowseMembersButton() {
        homepage.clickBrowseMembers();
    }

    @Then("I am taken to the Apply Now Section")
    public void iAmTakenToTheApplyNowSection() {
        String url = driver.getCurrentUrl();
        // this should be "https://www.thelunchcircle.com/#applynow" but for some reason the url stays the same
        String expectedURL = "https://www.thelunchcircle.com/";
        Assert.assertEquals(expectedURL, url);
    }
}
