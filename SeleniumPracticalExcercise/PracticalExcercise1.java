import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

    public static void main(String[] args) {
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        //Practice Execercise - 1

        //Lanuch a new driver
        WebDriver driver = new ChromeDriver();

        String correcturl = "http://store.demoqa.com/";

        //Open Store.DemoQA.com
        driver.get(correcturl);

        //Get Page Title name and Title length
        String title = driver.getTitle();
        int titleLength = title.length();

        //Print Page Title and Title length on the console
        System.out.println("Title : "+title+" title length : "+titleLength);

        //Get Page URL and verify if the it is a correct page opened
        String url = driver.getCurrentUrl();
        if(url.equals(correcturl))
            System.out.println("Page URL is correct");
        else
            System.out.println("Current page URL is wrong : "+url);

        //Get Page Source (HTML Source code) and Page Source length
        String source = driver.getPageSource();
        int sourceLength = source.length();

        //Print Page Length on Console
        System.out.println("Page length : "+sourceLength);

        //Close the Browser.
        driver.close();
    }
}