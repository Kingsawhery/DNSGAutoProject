package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.HoiClbPage;
import DNSG.com.pages.LoginPage;
import org.testng.annotations.Test;
import quangtester.com.helpers.ExcelHelper;

public class HoiClbTest extends BaseTest {
    LoginPage loginPage;
    HoiClbPage hoiClbPage;
    ExcelHelper excelHelper;

    @Test(priority = 1)
    public void ThemMoiHoiClbThanhCong(){
       loginPage = new LoginPage();
       hoiClbPage = new HoiClbPage();
       excelHelper = new ExcelHelper();
       excelHelper.setExcelFile("src/main/resources/datatest/HoiClb.xlsx","ThemHoiClb");
       excelHelper.setExcelFile("src\\main\\resources\\datatest\\HoiClb.xlsx","ThemHoiClb");
       loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                excelHelper.getCellData(3,5));

       hoiClbPage.ThemMoiHoiClB(excelHelper.getCellData(8,5),
                                excelHelper.getCellData(9,5),
                                excelHelper.getCellData(10,5));
       hoiClbPage.veriifyThemHoiThanhCong(excelHelper.getCellData(13,5));
    }


    @Test(priority = 2)
    public void XoaHoiClb(){
        loginPage = new LoginPage();
        hoiClbPage = new HoiClbPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/HoiClb.xlsx","XoaHoiClb");
        excelHelper.setExcelFile("src\\main\\resources\\datatest\\HoiClb.xlsx","XoaHoiClb");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        hoiClbPage.XoaHoiClb();
        hoiClbPage.verifyXoaHoiThanhCong(excelHelper.getCellData(9,5));
    }

    @Test(priority = 3)
    public void ChinhSuaHoiClbThanhCong(){
        loginPage = new LoginPage();
        hoiClbPage = new HoiClbPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/HoiClb.xlsx","EditHoiClb");
        excelHelper.setExcelFile("src\\main\\resources\\datatest\\HoiClb.xlsx","EditHoiClb");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        hoiClbPage.EditHoiClb(excelHelper.getCellData(8,5),
                            excelHelper.getCellData(9,5),
                            excelHelper.getCellData(10,5));
        hoiClbPage.verifyChinhSuaThanhCong(excelHelper.getCellData(13,5));
    }
}
