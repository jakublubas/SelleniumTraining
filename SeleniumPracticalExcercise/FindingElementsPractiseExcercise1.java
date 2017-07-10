import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

    public static void main(String[] args) {
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        //Finding Elements Practise Excercise 1

        //Launch new Browser
        WebDriver driver = new ChromeDriver();

        //Open URL http://toolsqa.wpengine.com/automation-practice-form/
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

        //Type Name & Last Name (Use Name locator)
        driver.findElement(By.name("firstname")).sendKeys("Kuba");
        driver.findElement(By.name("lastname")).sendKeys("KubaLN");

        //Click on Submit button (Use ID locator)
        driver.findElement(By.id("submit")).click();

        driver.quit();

    }
}