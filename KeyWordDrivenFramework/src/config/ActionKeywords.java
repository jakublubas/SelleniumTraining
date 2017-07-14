package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ActionKeywords {
    public static WebDriver driver;

    public static void openBrowser(){
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
    }

    public static void navigate(String sURL){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(sURL);
    }

    public static void click_MyAccount(){
        driver.findElement(By.xpath("//*[@id=\"account\"]/a")).click();
    }

    public static void input_Username(String sUsername){
        driver.findElement(By.id("log")).sendKeys(sUsername);
    }

    public static void input_Password(String sPassword){
        driver.findElement(By.id("pwd")).sendKeys(sPassword);
    }

    public static void click_Login(){
        driver.findElement(By.id("login")).click();
    }

    public static void waitFor(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void closeBrowser(){
        driver.quit();
    }
}
