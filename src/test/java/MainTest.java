import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver","C:/drive/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

    }
}
