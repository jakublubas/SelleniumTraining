package appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

/**
 * Created by int_jalu on 2017-07-11.
 */
public class SignIn_Action {
    public static void Execute(WebDriver driver, String sUserName, String sPassword){
        HomePage.lnk_MyAccount(driver).click();
        LoginPage.txtbx_UserName(driver).sendKeys(sUserName);
        LoginPage.txtbx_Password(driver).sendKeys(sPassword);
        LoginPage.btn_LogIn(driver).click();
    }
}
