package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ExcelUtils;

import java.util.concurrent.TimeUnit;

public class DataProviderWithExcel {
    private String sTestCaseName;
    private int iTestCaseRow;
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod()throws Exception{
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
    }

    @Test(dataProvider = "Authentication")
    public void Registration_data(String sUserName, String sPassword){

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.findElement(By.id("log")).sendKeys(sUserName);
        System.out.println(sUserName);
        driver.findElement(By.id("pwd")).sendKeys(sPassword);
        System.out.println(sPassword);
        driver.findElement(By.id("login")).click();
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        //driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

    @DataProvider
    public Object[][] Authentication() throws Exception{
        ExcelUtils.setExcelFile("C://Users//int_jalu.MOBICAPL//Desktop//SeleniumTraining//PageObjectModel//src//TestData//TestData.xlsx","Sheet1");
        sTestCaseName = this.toString();
        sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
        Object[][] testObjArray = ExcelUtils.getTableArray("C://Users//int_jalu.MOBICAPL//Desktop//SeleniumTraining//PageObjectModel//src//TestData//TestData.xlsx","Sheet1",iTestCaseRow);
        return (testObjArray);

    }
}
