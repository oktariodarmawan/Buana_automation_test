package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MissingElementPage {
    private WebDriver driver;
    private By galleryElement = By.xpath("//A[@href='/gallery/'][text()='Gallery']");
    public MissingElementPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement gallery(){
        return driver.findElement(galleryElement);
    }

    public void navigatePage(){
        driver.navigate().refresh();
    }

    public boolean isElementPresent(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
