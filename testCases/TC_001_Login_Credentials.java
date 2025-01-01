package testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Login_HomePage;
import testBase.Login_BaseClass;

public class TC_001_Login_Credentials extends Login_BaseClass{

    @Test
    public void login_UsingValidData() throws IOException{
        //("**********  Startng TC_001_Login_Test ************");
        
        //HomePage
        Login_HomePage LHP = new Login_HomePage(driver);

        LHP.clickMyAccount();
        LHP.clickLogin();

        //Login Page
        LHP.enterEmail(p.getProperty("validEmail"));
        LHP.enterPassword(p.getProperty("validPWD"));
        LHP.clickSubmit();

       //verify the title of the login page
       String expectedTitle = "My Account";
       Assert.assertEquals(driver.getTitle(), expectedTitle, "Title does not match!");

       // Do logout after login
       LHP.clickMyAccount();
       LHP.clickLogout();

        //verify the title of the logout page
        expectedTitle = "Account Logout";
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title does not match!");
        

        // 
        //("**********  Ending TC_001_Login_Test ************");

    }

}
