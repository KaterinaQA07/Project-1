import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lesson_5_Locator_CSS_xpath {
    private static String URL = "https://www.saucedemo.com/index.html";
    private static String URL1 = "https://www.tut.by/";
    private ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:/drive/chromedriver.exe");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void cssId () {
        driver = new ChromeDriver();
        driver.get (URL);
        WebElement name = driver.findElement(By.cssSelector("#user-name"));
        name.sendKeys("Katalina");
    }
    @Test
    public void linkText (){
        By linkTextLocator = By.linkText("Accepted usernames are:");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.findElements(linkTextLocator);
    }
    @Test
    public void cssAttribute () {
        By attributeEqualLocator = By.cssSelector("div[for = login_logo]");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.findElements(attributeEqualLocator);
    }
    @Test
    public void cssAttributeValue() {
        By value = By.cssSelector("input[placeholder^=Username]");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.findElements(value);
    }
    @Test
    public void nameTest() {
        By viewportLocator = By.name("viewport");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.findElements(viewportLocator);
    }
    @Test
    public void partialLinkTest() {
        By partialLinkLocator = By.partialLinkText("Accepted");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.findElement(partialLinkLocator);
    }
    @Test
    public void tagNameTest() {
        By tagNameLocator = By.tagName("script");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.findElement(tagNameLocator);
    }
    @Test
    public void classNameTest() {
        By classNameLocator = By.className("sub-inf");
        driver = new ChromeDriver();
        driver.get(URL1);
        driver.findElement(classNameLocator);
    }



}
