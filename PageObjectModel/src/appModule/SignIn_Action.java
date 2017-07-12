package appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utility.ExcelUtils;
import utility.Log;


public class SignIn_Action {
    public static void Execute(WebDriver driver)throws Exception{
        String sUsername = ExcelUtils.getCellData(1, 1);
        Log.info("Username picked from Excel is "+ sUsername );
        String sPassword = ExcelUtils.getCellData(1,2);
        Log.info("Password picked from Excel is "+ sPassword );

        HomePage.lnk_MyAccount(driver).click();
        Log.info("Click action performed on My Account link");
        LoginPage.txtbx_UserName(driver).sendKeys(sUsername);
        Log.info("Username entered in the Username text box");
        LoginPage.txtbx_Password(driver).sendKeys(sPassword);
        Log.info("Password entered in the Password text box");
        LoginPage.btn_LogIn(driver).click();
        Log.info("Click action performed on Submit button");

    }
}
