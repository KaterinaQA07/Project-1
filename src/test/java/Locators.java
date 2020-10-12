import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Locators {
    private static String URL = "https://tut.by";
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
    public void classnameTest(){
        driver = new ChromeDriver();
        driver.get(URL);
        WebElement menu = driver.findElement(By.className("icon-burger"));
        menu.click();
    }

    @Test
    public void cssRecall() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/index.html");
        WebElement name = driver.findElement(By.cssSelector("#user-name"));
        name.click();
    }
    //input[@id="user-name"]/ancestor::form
}
