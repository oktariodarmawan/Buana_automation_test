package Base;

import Page_Object.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    }


    @AfterTest
    public void teardown(){
        driver.quit();
        
    }
}
