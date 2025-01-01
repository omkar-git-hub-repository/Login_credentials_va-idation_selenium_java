package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_HomePage extends Login_basePage {

    public Login_HomePage(WebDriver driver)
    {
        super(driver);
    }

    // Locators for login page elements
    @FindBy(xpath="//span[text()='My Account']")
    WebElement myAccountbtn;

    @FindBy(xpath="//a[text()='Login']")
    WebElement loginBtn;

    @FindBy(xpath="//input[@id='input-email']")
    WebElement emailInput;
    
    @FindBy(xpath="//input[@id='input-password']")
    WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitBtn;

    // logout from
    @FindBy(xpath = "//li/a[text()='Logout']")
    WebElement logoutBtn;

    // Actions for login page
    public void clickMyAccount(){
        myAccountbtn.click();
    }
    
    public void clickLogin(){
        loginBtn.click();
    }
    
    public void enterEmail(String validEmail){
        emailInput.sendKeys(validEmail);
    }
    
    public void enterPassword(String validPWD){
        passwordInput.sendKeys(validPWD);
    }
    
    public void clickSubmit(){
        submitBtn.click();
    }

    public void clickLogout(){
        logoutBtn.click();
    }
    
}
