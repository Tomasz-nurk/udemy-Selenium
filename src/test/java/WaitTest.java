import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest extends BaseSeleniumTest {
    @Test
    public void testWait() {

        driver.get("file:///C:/Users/Admin/Documents/zasoby/Waits.html");
        WebElement button = driver.findElement(By.id("clickOnMe"));
        //button.click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(3000);
        WebElement paragraph = driver.findElement(By.xpath("/html/body/p"));
        System.out.println(paragraph.getText());
        //Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }
}
