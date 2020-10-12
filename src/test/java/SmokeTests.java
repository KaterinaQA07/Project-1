import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SmokeTests {
    @Test
    public void smokeTest1() {
        System.setProperty("webdriver.chrome.driver","C:/drive/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://healthunify.com/bmicalculator/");

        WebElement weightInputField = driver.findElement(By.name("wg"));
        weightInputField.sendKeys("40");

        /*WebElement footheightSelectField = driver.findElement(By.name("opt2"));
       footheightSelectField.sendKeys("5");*/

        WebElement dropdown = driver.findElement(By.name("opt2"));
        Select dropdownSelect = new Select(dropdown);
        dropdownSelect.selectByValue("5");

        /*WebElement dheighSelectField = driver.findElement(By.name("opt3"));
        dheighSelectField.sendKeys("6");*/

        WebElement dropdown2 = driver.findElement(By.name("opt3"));
        Select dropdownSelect2 = new Select(dropdown2);
        dropdownSelect2.selectByIndex(6);

        WebElement button = driver.findElement(By.xpath("//input[@value = 'Calculate']"));
        button.click();

        driver.quit();
    }
}
