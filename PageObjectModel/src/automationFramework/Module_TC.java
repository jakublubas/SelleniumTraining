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


        //SignIn_Action.Execute(driver,"TestUser_2", "TestPassword");
        HomePage.lnk_LogOut(driver).click();
        System.out.println("Login Succesfully");

        driver.quit();
    }

}
