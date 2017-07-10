import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

    public static void main(String[] args) {
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        //Practice Execercise Navigation 1

        //Launch new Browser
        WebDriver driver = new ChromeDriver();

        //Open DemoQA.com website
        driver.get("http://DemoQA.com");

        //Click on Registration link using
        // “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
        driver.get("http://ry-sa.pl");

        //Come back to Home page (Use ‘Back’ command)
        driver.navigate().back();

        //Again go back to Registration page (This time use ‘Forward’ command)
        driver.navigate().forward();

        //Again come back to Home page (This time use ‘To’ command)
        driver.navigate().to("http://DemoQA.com");

        //Refresh the Browser (Use ‘Refresh’ command)
        driver.navigate().refresh();

        //Close the Browser
        driver.quit();
    }
}