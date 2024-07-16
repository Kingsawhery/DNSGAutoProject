package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.LoginPage;
import org.testng.annotations.Test;
import quangtester.com.helpers.ExcelHelper;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    ExcelHelper excelHelper;

    @Test (priority = 1)
    public void loginTestDNSGSuccess(){
        loginPage = new LoginPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/LoginPage.xlsx","AccountUser");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
<<<<<<< HEAD
        loginPage.verifyLoginThanhCong(excelHelper.getCellData(5,5));

    }
    @Test(priority = 3)
    public void loginAdmin(){
        loginPage =new LoginPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/LoginPage.xlsx","AccountUser");
        loginPage.LoginAdmin(excelHelper.getCellData(11,5),
                            excelHelper.getCellData(12,5));
    }
    @Test(priority = 4)
    public void loginAccHoi(){
        loginPage =new LoginPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/LoginPage.xlsx","AccountUser");
        loginPage.LoginAccHoi(excelHelper.getCellData(14,5),
                excelHelper.getCellData(15,5));
    }
=======
        //loginPage.verifyLoginThanhCong(excelHelper.getCellData(5,5));

    }
>>>>>>> developerII

    @Test (priority = 2)
    public void loginTestDNSGThatBai(){
        loginPage = new LoginPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/LoginPage.xlsx","AccountUser");
        loginPage.LoginThatBai(excelHelper.getCellData(7,5),
                                 excelHelper.getCellData(8,5));
<<<<<<< HEAD
        loginPage.verifyLoginThatBai(excelHelper.getCellData(10,5));
=======
        //loginPage.verifyLoginThatBai(excelHelper.getCellData(10,5));
>>>>>>> developerII
    }
}
