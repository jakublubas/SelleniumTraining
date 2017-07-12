package automationFramework;

import appModule.SignIn_Action;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

import java.util.concurrent.TimeUnit;

public class Log4j_Logging_TC {

    private static WebDriver driver =  null;

    public static void main(String[] args) throws Exception {

        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Selenium_Test_001");
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
        Log.info("Excel sheet opened");

        //ChromeDriver
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        Log.info("New driver instantiated");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log.info("Implicit wait applied on the driver for 10 seconds");

        driver.get(Constant.URL);
        Log.info("Web application launched");

        SignIn_Action.Execute(driver);

        driver.quit();

        Log.info("Browser closed");
        ExcelUtils.setCellData("Pass", 1, 3);
        Log.endTestCase("Selenium_Test_001");
    }

}
