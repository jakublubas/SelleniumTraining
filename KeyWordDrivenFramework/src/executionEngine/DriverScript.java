package executionEngine;

import config.ActionKeywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.ExcelUtils;

import java.util.concurrent.TimeUnit;

import static config.ActionKeywords.*;

public class DriverScript {
    public static void main(String[] args) throws Exception {

        String sPath = "C:\\Users\\int_jalu.MOBICAPL\\Desktop\\SeleniumTraining\\KeyWordDrivenFramework\\src\\dataEngine\\DataEngine.xlsx";
        ExcelUtils.setExcelFile(sPath, "Test Steps");

        for (int iRow=1;iRow<=9;iRow++){
            //Storing the value of excel cell in sActionKeyword string variable
            String sActionKeyword = ExcelUtils.getCellData(iRow, 3);

            //Comparing the value of Excel cell with all the project keywords
            if(sActionKeyword.equals("openBrowser")){
                //This will execute if the excel cell value is 'openBrowser'
                //Action Keyword is called here to perform action
                ActionKeywords.openBrowser();}
            else if(sActionKeyword.equals("navigate")){
                ActionKeywords.navigate("http://store.demoqa.com/");}
            else if(sActionKeyword.equals("click_MyAccount")){
                ActionKeywords.click_MyAccount();}
            else if(sActionKeyword.equals("input_Username")){
                ActionKeywords.input_Username("TestUser_123");}
            else if(sActionKeyword.equals("input_Password")){
                ActionKeywords.input_Password("TestPassword@123");}
            else if(sActionKeyword.equals("click_Login")){
                ActionKeywords.click_Login();}
            else if(sActionKeyword.equals("waitFor")){
                ActionKeywords.waitFor();}
            else if(sActionKeyword.equals("closeBrowser")){
                ActionKeywords.closeBrowser();}
        }
    }
}