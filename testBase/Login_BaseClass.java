package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Login_BaseClass {
    // Base class for login tests
    // Add any common methods or setup here

    public WebDriver driver;
    public Properties p;

    @BeforeClass
    public void setup() throws IOException {

        // Load the properties file
        FileReader file = new FileReader("./src/main/resources/config_Login.properties");
        p = new Properties();
        p.load(file);

        // Create a new ChromeDriver instance
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(p.getProperty("LoginAppURL"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        // Close the driver after the tests

    }
    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
