import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

    public static void main(String[] args) {
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        //Finding Elements Practise Excercise 2

        //Launch new Browser
        WebDriver driver = new ChromeDriver();

        //Open URL http://toolsqa.wpengine.com/automation-practice-form/
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

        //Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
        driver.findElement(By.partialLinkText("Partial")).click();
        System.out.println("Partial test PASS");

        //Identify Submit button with ‘tagName’, convert it in to string and print it on the console
        String submit = driver.findElement(By.tagName("button")).toString();
        System.out.println("Text on submit button : "+submit);

        //Click on the Link “Link Test” (Use ‘linkTest’ locator)
        driver.findElement(By.linkText("Link Test"));
        System.out.println("Link test PASS");

        driver.close();
    }
}