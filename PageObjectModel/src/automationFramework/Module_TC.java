package automationFramework;

import appModule.SignIn_Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class Module_TC {
    private static WebDriver driver = null;

    public static void main(String[] args){
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");

        /*HomePage.lnk_MyAccount(driver).click();
        LoginPage.txtbx_UserName(driver).sendKeys("testuser_1");
        LoginPage.txtbx_Password(driver).sendKeys("Test@123");
        LoginPage.btn_LogIn(driver).click();
       */

        SignIn_Action.Execute(driver);
        HomePage.lnk_LogOut(driver).click();
        System.out.println("Login Succesfully");

        driver.quit();
    }

}
