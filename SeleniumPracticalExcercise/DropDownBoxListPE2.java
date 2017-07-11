
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

        //Practice Exercise - 2 (Drop Down Box/List)

        //Launch new Browser
        WebDriver driver = new ChromeDriver();

        //Open “http://toolsqa.wpengine.com/automation-practice-form/”
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

        //Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
        Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));

        //Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
        oSelect.selectByIndex(0);
        System.out.println("Selected Browser Commands");
        oSelect.deselectByIndex(0);
        System.out.println("Deselected Browser Commands");

        //Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
        oSelect.selectByVisibleText("Navigation Commands");
        System.out.println("Selected Navigation Commands");
        oSelect.deselectByVisibleText("Navigation Commands");
        System.out.println("Deslected Navigation Commands");

        //Print and select all the options for the selected Multiple selection list.
        List <WebElement> lList = oSelect.getOptions();
        int iSize = lList.size();

        for (int i=0; i<iSize; i++){
            String sList = lList.get(i).getText();
            System.out.println("Element("+i+") = "+sList);
            oSelect.selectByIndex(i);
        }

        //Deselect all options
        for (int j = 0; j<iSize; j++){
            oSelect.deselectByIndex(j);
        }
        //or
        oSelect.deselectAll();

        //Close the browser

        driver.quit();
    }
}