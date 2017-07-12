package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

public class FirstTestCase {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        //ChromeDriver
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.get("http://www.store.demoqa.com");

        HomePage.lnk_MyAccount(driver).click();
        LoginPage.txtbx_UserName(driver).sendKeys("TestUser_1");
        LoginPage.txtbx_Password(driver).sendKeys("Test@123");
        LoginPage.btn_LogIn(driver).click();

        driver.quit();
    }
}
