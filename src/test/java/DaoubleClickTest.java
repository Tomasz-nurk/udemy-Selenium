import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DaoubleClickTest extends BaseSeleniumTest {
    @Test
    public void doubleClickTest() {
        SeleniumHelper helper = new SeleniumHelper(driver);
        driver.get("file:///C:/Users/Admin/Documents/zasoby/DoubleClick.html");
        WebElement button = driver.findElement(By.id("bottom"));
        Actions action = new Actions(driver);
        action.moveToElement(button).doubleClick().build().perform();
        helper.takesScreenshots();
        Assert.assertTrue(driver.getWindowHandles().size()>1);
    }
}
