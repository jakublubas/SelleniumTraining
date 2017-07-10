import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

    public static void main(String[] args) {
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        //Practice Execercise - 2

        //Launch a new browser
        WebDriver driver = new ChromeDriver();

        //Open http://demoqa.com/frames-and-windows/
        driver.get("http://demoqa.com/frames-and-windows/");

        //Use this statement to click on a New Window button
        // “driver.findElement(By.xpath(“.//*[@id=’tabs-1′]/div/p/a”)).click();”
        driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();

        //Close the browser using close() command
        //close() - closing tab
        //quit() - closing driver
        driver.quit();



    }
}