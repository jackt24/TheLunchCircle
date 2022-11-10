package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Contains all the elements from the Homepage
public class HomePage extends BaseClass {

    WebDriver driver;

    // Constructor that will be automatically called as soon as the class is created
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    // Elements

    By browseMembersButton = By.xpath ("//*[contains(text(),'Browse members')]");

    // Functions

    // Method to click the browse button
    public void clickBrowseMembers() {
        driver.findElement(browseMembersButton).click();
    }






}
