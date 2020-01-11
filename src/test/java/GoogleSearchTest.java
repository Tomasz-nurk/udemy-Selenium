import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Set;

import static org.openqa.selenium.Keys.ENTER;

public class GoogleSearchTest extends BaseSeleniumTest {

    @Test
    public void googleSearchTest() {
//("arguments[0].click();", element);
        driver.get("https://www.w3schools.com/");
        Actions action = new Actions(driver);
        //action.contextClick().build().perform();
        action.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();



        /*WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);
        action.contextClick().build().perform();
        *//*executor.executeScript("arguments[0].setAttribute('value', 'Selenium')",searchInput);
        //searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumLink = driver.findElement(By.xpath("//a[@href='https://selenium.dev/']"));
        executor.executeScript("arguments[0].click();", seleniumLink);
        Assert.assertEquals(driver.getTitle(), "SeleniumHQ Browser Automation");*/
    }












    private void switchToNewWindow(WebDriver driver, String currentWindowName) {
        System.out.println("Wartosc dla obecnego okna to " +currentWindowName);
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Ilosc okien to " +windows.size());
        for(String window : windows) {
            if (!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }
        }
    }

    public boolean checkIfElementExist(By locator, WebDriver driver) {
        if (driver.findElements(locator).size() > 0) {
            System.out.println("Element istnieje na stronie");
            return true;
        }
        System.out.println("Brak elementu na stronie");
        return false;
    }
    public void checkIfElementExist (WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            System.out.println("Element istnieje na stronie");
        } catch (NoSuchElementException exc) {
            System.out.println("Element nie istnieje");
        }
    }
}





//driver.findElement(By.id("newPage")).click();
//driver.quit();
//driver.close();
        /*WebElement firstNameInput = driver.findElement(By.name("fname"));
        WebElement w3schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleLink = driver.findElement(By.partialLinkText("Weird"));
        WebElement secretParagraph = driver.findElement(By.className("topSecret"));
        WebElement clickOnMeCSSbutton = driver.findElement(By.cssSelector("#clickOnMe"));*/
        /*WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement firstNameInput = driver.findElement(By.name("fname"));
        firstNameInput.sendKeys("Pawel");
        firstNameInput.clear();
        firstNameInput.sendKeys("Rafal");*/
        /*Select carSelect = new Select(driver.findElement(By.tagName("select")));
        carSelect.selectByIndex(2);
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Pawel");
        System.out.println("Wartosc to: "+firstNameInput.getAttribute("value"));*/
       /* WebElement label = driver.findElement(By.tagName("label"));
        System.out.println(label.getText());
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        checkbox.click();
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='male']"));
        radioButton.click();
        WebElement hiddenParagraph = driver.findElement(By.className("topSecret"));
        System.out.println(hiddenParagraph.getAttribute("textContent"));*/
        /*WebElement smileImg = driver.findElement(By.id("smileImage"));
        System.out.println(smileImg.getAttribute("naturalHeight"));*/
       /* WebElement firstNameInput = driver.findElement(By.id("fname"));
        if (firstNameInput.isEnabled()) {
            System.out.println("Element nie jest zablokowany");
            firstNameInput.sendKeys("Piotr");
        } else {
            System.out.println("Element jest zablokowany. Nie mozesz nic wpisac");
        }*/
      /*  WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (checkbox.isSelected()) {
            System.out.println("Checkbox jest zaznaczony");
            checkbox.click();
            System.out.println("Checkbox jest odznaczony");
        } else {
            System.out.println("Checkbox nie jest zaznaczony");
        }*/
        /*WebElement hiddenParagraph = driver.findElement(By.className("topSecret"));
        if (hiddenParagraph.isDisplayed()) {
            System.out.println("Element jest widoczny");
            System.out.println(hiddenParagraph.getText());
            hiddenParagraph.click();
        } else {
            System.out.println("Element nie jest widoczny na stronie");
            System.out.println(hiddenParagraph.getAttribute("textContent"));
        }*/
        /*checkIfElementExist(By.tagName("a"), driver);
        checkIfElementExist(By.tagName("hdjsks"), driver);*/
        /*checkIfElementExist(driver, By.tagName("a"));
        checkIfElementExist(driver, By.tagName("jhsdkaj"));*/
        /*WebElement newPageButton = driver.findElement(By.id("newPage"));
        String currentWindowName = driver.getWindowHandle();
        newPageButton.click();

        switchToNewWindow(driver, currentWindowName);
        System.out.println("Tytul to" +driver.getTitle());
        System.out.println("Obecny URL to" + driver.getCurrentUrl());
        driver.switchTo().window(currentWindowName);
        driver.findElement(By.name("username")).sendKeys(" Mouse");*/