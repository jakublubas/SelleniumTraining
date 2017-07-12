package automationFramework;

import appModule.SignIn_Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import utility.Constant;

import java.util.concurrent.TimeUnit;

import static utility.Constant.Password;
import static utility.Constant.URL;
import static utility.Constant.Username;

public class Global_Var_TC {

    private static WebDriver driver = null;

    public static void main(String[] args){

        //ChromeDriver
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);

        //SignIn_Action.Execute(driver,Username,Password);
        System.out.println("Login Successfully!");

        HomePage.lnk_LogOut(driver).click();
        driver.quit();

    }
}
