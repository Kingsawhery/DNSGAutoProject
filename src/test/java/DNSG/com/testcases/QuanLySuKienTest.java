package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.LoginPage;
import DNSG.com.pages.QuanLySuKienPage;
import org.testng.annotations.Test;
import quangtester.com.helpers.ExcelHelper;
import quangtester.com.keywords.WebUI;

public class QuanLySuKienTest extends BaseTest {
    LoginPage loginPage;
    QuanLySuKienPage quanLySuKienPage;
    ExcelHelper excelHelper;

 //   @Test
//    public void KiemTraGiaTriTongTable(){
//        loginPage = new LoginPage();
//        quanLySuKienPage = new QuanLySuKienPage();
//        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
//        quanLySuKienPage.GotoQuanLiSuKienPage();
//        WebUI.sleep(5);
//        quanLySuKienPage.checkSearchTableByColumn("Nguyễn Tấn Tài");
//
//    }
<<<<<<< HEAD
    @Test
    public void verifyEventList(){
        loginPage = new LoginPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        quanLySuKienPage = new QuanLySuKienPage();
        quanLySuKienPage.verifyEvent();
    }
=======

>>>>>>> develop

    @Test(priority = 1)
    public void ThemMoiSuKienB2BThanhCong(){
        loginPage = new LoginPage();
        quanLySuKienPage = new QuanLySuKienPage();
        excelHelper = new ExcelHelper();
<<<<<<< HEAD
        excelHelper.setExcelFile("src/main/resources/datatest/QuanLySuKienB2B.xlsx","ThemSuKienB2B");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));

        excelHelper.setExcelFile("src/main/resources/datatest/QuanLySuKienB2B.xlsx","ThemSuKienB2B");
=======
        excelHelper.setExcelFile("src\\main\\resources\\datatest\\QuanLySuKienB2B.xlsx","ThemSuKienB2B");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));

        excelHelper.setExcelFile("src\\main\\resources\\datatest\\QuanLySuKienB2B.xlsx","ThemSuKienB2B");
>>>>>>> develop
        quanLySuKienPage.ThemMoiSuKien(excelHelper.getCellData(9,5),
                                        excelHelper.getCellData(14,5),
                                        excelHelper.getCellData(15,5),
                                        excelHelper.getCellData(16,5));
        quanLySuKienPage.verifyThemMoiSuKienThanhCong(excelHelper.getCellData(18,5));
    }

<<<<<<< HEAD
    @Test(priority = 3)
=======
    @Test(priority = 2)
>>>>>>> develop
    public void XoaSuKienB2B(){
        loginPage = new LoginPage();
        quanLySuKienPage = new QuanLySuKienPage();
        excelHelper = new ExcelHelper();
<<<<<<< HEAD
        excelHelper.setExcelFile("src/main/resources/datatest/QuanLySuKienB2B.xlsx","XoaSuKienB2B");
=======
        excelHelper.setExcelFile("src\\main\\resources\\datatest\\QuanLySuKienB2B.xlsx","XoaSuKienB2B");
>>>>>>> develop
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        quanLySuKienPage.XoaSuKien();
        quanLySuKienPage.verifyMessageXoaSuKien(excelHelper.getCellData(11,5));
    }

<<<<<<< HEAD
    @Test(priority = 2)
=======
    @Test(priority = 3)
>>>>>>> develop
    public void ChinhSuaSuKienB2BThanhCong(){
        loginPage = new LoginPage();
        quanLySuKienPage = new QuanLySuKienPage();
        excelHelper = new ExcelHelper();
<<<<<<< HEAD
        excelHelper.setExcelFile("src/main/resources/datatest/QuanLySuKienB2B.xlsx","EditSuKienB2B");
=======
        excelHelper.setExcelFile("src\\main\\resources\\datatest\\QuanLySuKienB2B.xlsx","EditSuKienB2B");
>>>>>>> develop
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        quanLySuKienPage.ChinhSuaSuKien(excelHelper.getCellData(9,5),
                                        excelHelper.getCellData(14,5),
                                        excelHelper.getCellData(15,5),
                                        excelHelper.getCellData(16,5));
        quanLySuKienPage.verifyMessageEditSuKienThanhCong(excelHelper.getCellData(18,5));
    }

}
