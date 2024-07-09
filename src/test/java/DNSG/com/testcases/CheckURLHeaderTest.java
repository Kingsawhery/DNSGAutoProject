package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.CheckURLHeader;
import DNSG.com.pages.LoginPage;
import org.testng.annotations.Test;
import quangtester.com.helpers.ExcelHelper;

public class CheckURLHeaderTest extends BaseTest {
    LoginPage loginPage;
    CheckURLHeader checkURLHeader;
    ExcelHelper excelHelper;

    @Test (priority = 1)
    public void verifyGioiThieuPage(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/AccountCheckURL.xlsx","CheckURL");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));

        excelHelper.setExcelFile("src/main/resources/datatest/AccountCheckURL.xlsx","CheckURL");
        checkURLHeader.checkURLGioiThieu("https://saigon-business.erp.meu-solutions.com/gioi-thieu");
    }

    @Test(priority = 2)
    public void verify9thmonthlyb2bPage(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/AccountCheckURL.xlsx","CheckURL");
        loginPage.LoginThanhCong(excelHelper.getCellData(10,5),
                                 excelHelper.getCellData(11,5));
        checkURLHeader.checkURL9thmonthlyb2b("https://saigon-business.erp.meu-solutions.com/9th-monthly-b2b");
    }

    @Test (priority = 3)
    public void verifyGiaoThuongB2B(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/AccountCheckURL.xlsx","CheckURL");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        checkURLHeader.checkURLGiaoThuongB2B("https://saigon-business.erp.meu-solutions.com/giao-thuong-b2b");
    }

    @Test (priority = 4)
    public void verifyHiepHoiHoiClb(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/AccountCheckURL.xlsx","CheckURL");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        checkURLHeader.checkURLHiepHoiHoiClb("https://saigon-business.erp.meu-solutions.com/hiep-hoi-hoi-cau-lac-bo");
    }

    @Test (priority = 5)
    public void verifySuKienDoiTac(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/AccountCheckURL.xlsx","CheckURL");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        checkURLHeader.checkURLSuKienDoiTac("https://saigon-business.erp.meu-solutions.com/su-kien-doi-tac");
    }

    @Test (priority = 6)
    public void verifyLienHe(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/AccountCheckURL.xlsx","CheckURL");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        checkURLHeader.checkURLLienHe("https://saigon-business.erp.meu-solutions.com/lien-he");
    }

}
