package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

        @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        String exePath = "C:\\Users\\int_jalu.MOBICAPL\\Selenium\\ChromeWebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        Driver = new ChromeDriver();
        Driver.navigate().to("http://store.demoqa.com/");
        System.out.println("I navigate to the login page\n");
        Driver.findElement(By.xpath("//*[@id=\"account\"]/a")).click();

    }


        @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {

        System.out.println("I should see the userform page");
        String title = Driver.getTitle();
        System.out.println("Page title is: "+title);

    }

        @And("^I entered ([^\"]*) and ([^\"]*)$")
    public void iEnteredUsernameAndPassword(String userName, String password) throws Throwable {

        Driver.findElement(By.id("log")).sendKeys(userName);
        Driver.findElement(By.id("pwd")).sendKeys(password);
    }

        @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {

        Driver.findElement(By.name("submit")).click();
        Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        System.out.println("I clicked at Login>> button after 3 sec ");}


        @Then("^I should see the wrong data message$")
    public void iShouldSeeTheWrongDataMessage() throws Throwable {

            //String error = Driver.findElement(By.className("response")).toString();
            long start = System.currentTimeMillis();
            WebElement error = Driver.findElement(By.xpath("//*[@id=\"ajax_loginform\"]/p[1]"));


            if (error.isDisplayed()){
                System.out.println("Test PASSED");
                long stop = System.currentTimeMillis();
                System.out.println("Execute time to show ERROR: "+(stop-start)+"ms\n");}
            else
                System.out.println("Test NOT PASSED");

            Driver.quit();
            }

    }

