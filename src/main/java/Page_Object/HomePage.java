package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginPageLink = By.xpath("//A[@href='/login'][text()='Form Authentication']");
    private By fileUploadLink = By.xpath("//A[@href='/upload'][text()='File Upload']");
    private By missingElementLink = By.xpath("//A[@href='/disappearing_elements'][text()='Disappearing Elements']");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickLoginPage(){
        driver.findElement(loginPageLink).click();
        return new LoginPage(driver);
    }

    public FileUpload clickFileUpload(){
        driver.findElement(fileUploadLink).click();
        return new FileUpload(driver);
    }
    public MissingElementPage clickMissingPageLink(){
        driver.findElement(missingElementLink).click();
        return new MissingElementPage(driver);
    }

}
