import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LaunchingChrome {

    public static void main(String[] args) {
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        //Finding Elements Practise Excercise 2

        //Launch new Browser
        WebDriver driver = new ChromeDriver();

        //Open “http://toolsqa.wpengine.com/automation-practice-form/“
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

        //Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
        driver.findElement(By.id("sex-1")).click();
        System.out.println("Female test PASS");

        //Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
        driver.findElement(By.id("exp-2")).click();
        System.out.println("Experience test PASS");

        //Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
        //driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
        System.out.println("Profession test PASS");

        //Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
        driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
        System.out.println("Selenium test PASS");
    }
}