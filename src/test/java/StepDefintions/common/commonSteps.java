package StepDefintions.common;

import base.BaseClass;
import io.cucumber.java.en.Given;

// Because we extend Baseclass we can use driver without having to set it up again
public class commonSteps extends BaseClass {


    @Given("I navigate to the homepage")
    public void i_navigate_to_the_homepage() { driver.get("http://www.thelunchcircle.com");}
}
