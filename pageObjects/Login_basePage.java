package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login_basePage {

    WebDriver driver;

    public Login_basePage(WebDriver driver)
    {
        this.driver =driver;
        // Initialize page elements using PageFactory
        PageFactory.initElements(driver, this);
    }
}
