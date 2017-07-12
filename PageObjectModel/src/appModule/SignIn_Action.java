package appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utility.ExcelUtils;


public class SignIn_Action {
    public static void Execute(WebDriver driver)throws Exception{
        String sUsername = ExcelUtils.getCellData(1, 1);
        String sPassword = ExcelUtils.getCellData(1,2);

        HomePage.lnk_MyAccount(driver).click();
        LoginPage.txtbx_UserName(driver).sendKeys(sUsername);
        LoginPage.txtbx_Password(driver).sendKeys(sPassword);
        LoginPage.btn_LogIn(driver).click();

    }
}
