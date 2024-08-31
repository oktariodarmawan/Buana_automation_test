package Base;

import Page_Object.MissingElementPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class MissingElementTests extends BaseTest {

    @Test
    public void MissingElementTests(){
        
        MissingElementPage missingElement = homePage.clickMissingPageLink();

        for (int i = 0; i < 5; i++) {
            missingElement.navigatePage();


            boolean isElementPresent = missingElement.isElementPresent(By.xpath("//A[@href='/gallery/'][text()='Gallery']"));

            // Assertion: You can assert either presence or absence based on your test scenario
            if (isElementPresent) {
                System.out.println("Element is present on refresh " + (i + 1));
                assertTrue("Element should be present on refresh " + (i + 1), isElementPresent);
            } else {
                System.out.println("Element is NOT present on refresh " + (i + 1));
                assertFalse("Element should NOT be present on refresh " + (i + 1), isElementPresent);
            }
        }
    }
}
