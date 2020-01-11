import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayTest {
    @Test
    public void testEbay()throws InterruptedException {
        String driverPath = "C:\\Users\\Admin\\IdeaProjects\\MavenProjectFirst\\src\\main\\resources\\executables\\drivers\\chromedriver1.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        //Dimension dimension = new Dimension(1000, 1000);
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        Thread.sleep(3000);
        WebElement gdprBanner = driver.findElement(By.id("gdpr-banner"));
        WebElement gdprButton = gdprBanner.findElement(By.xpath("//button[@id='gdpr-banner-accept']"));
        gdprButton.click();







    }

}
