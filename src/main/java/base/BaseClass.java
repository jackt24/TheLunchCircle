package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// A class to hold all the initialisation and config utilities
public class BaseClass {

    public static WebDriver driver;

    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.thelunchcircle.com/");
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private void setBrowserWindow(){
        // Implement
    }

    public static void tearDown(){
        driver.quit();
    }

}