package testCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.Login_HomePage;
import testBase.Login_BaseClass;

public class TC_002_Login_using_InvalidData extends Login_BaseClass{

    @Test
    public void LoginUsingInvalidData() throws IOException{
        //("**********  Startng TC_002_Login_WithInvalid_Data_Tets ************");
        
        //HomePage
        Login_HomePage LHP = new Login_HomePage(driver);

        LHP.clickMyAccount();
        LHP.clickLogin();

        //Login using Invalid Credentials                          // Step 1
        LHP.enterEmail(p.getProperty("invalidEmail"));
        LHP.enterPassword(p.getProperty("validPWD"));
        LHP.clickSubmit();
        //verify the Warning message is displayed
        WebElement warningMessage1 = driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']"));
        // Validate if the element is displayed
        if (warningMessage1.isDisplayed()) {
            System.out.println("The warning message is displayed.");
        } else {
            System.out.println("The warning message is NOT displayed.");
        }



        //Login Using Empty data field in the Login form           // step 2
        LHP.enterEmail(p.getProperty("emptyEmail"));
        LHP.enterPassword(p.getProperty("emptyPWD"));
        LHP.clickSubmit();
        //verify the Warning message is displayed
        WebElement warningMessage2 = driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']"));
        // Validate if the element is displayed
        if (warningMessage2.isDisplayed()) {
            System.out.println("The warning message is displayed.");
        } else {
            System.out.println("The warning message is NOT displayed.");
        }
        


        //Login Using Numeric data field in the Login form          // step 3
        LHP.enterEmail(p.getProperty("numberEmail"));
        LHP.enterPassword(p.getProperty("numericPWD"));
        LHP.clickSubmit();

       //verify the Warning message is displayed
        WebElement warningMessage = driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']"));
        // Validate if the element is displayed
        if (warningMessage.isDisplayed()) {
            System.out.println("The warning message is displayed.");
        } else {
            System.out.println("The warning message is NOT displayed.");
        }

       
        

        //("**********  Ending TC_002_Login_Test ************");

    }

}
