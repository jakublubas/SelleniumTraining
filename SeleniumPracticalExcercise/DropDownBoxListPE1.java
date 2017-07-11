
import org.openqa.selenium.support.ui.Select;
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

        //Practice Exercise -1 (Drop Down Box/List)

        //Launch new Browser
        WebDriver driver = new ChromeDriver();

        //Open “http://toolsqa.wpengine.com/automation-practice-form/”
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

        //Select ‘Continents’ Drop down ( Use Id to identify the element )
        Select oSelect = new Select(driver.findElement(By.id("continents")));

        //Select option ‘Europe’ (Use selectByIndex)
        oSelect.selectByIndex(1);

        //Select option ‘Africa’ now (Use selectByVisibleText)
        oSelect.selectByVisibleText("Africa");

        //Print all the options for the selected drop down and select one option of your choice
        List <WebElement> elementCount = oSelect.getOptions();
        int iSize = elementCount.size();

        for(int i=0; i< iSize; i++){
            String sValue = elementCount.get(i).getText();
            System.out.println("Element("+i+") = "+sValue);
                if (i == 2)
                    oSelect.selectByIndex(i);
        }

        driver.quit();
    }
}