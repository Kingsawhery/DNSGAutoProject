package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.DonViTaiTroPage;
import DNSG.com.pages.LoginPage;

import com.google.j2objc.annotations.Weak;
import org.testng.annotations.Test;
import quangtester.com.helpers.ExcelHelper;
import quangtester.com.keywords.WebUI;

public class DonViTaiTroTest extends BaseTest {
    LoginPage loginPage;
    DonViTaiTroPage donViTaiTroPage;
    ExcelHelper excelHelper;




    @Test(priority = 1)
    public void ThemMoiDonViTaiTroThanhCong(){
        loginPage = new LoginPage();
        donViTaiTroPage = new DonViTaiTroPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/DonViTaiTroPage.xlsx","ThemDonVi");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));

        excelHelper.setExcelFile("src/main/resources/datatest/DonViTaiTroPage.xlsx","ThemDonVi");
        donViTaiTroPage.ThemMoiDonViTaiTro(excelHelper.getCellData(8,5),
                                            excelHelper.getCellData(9,5));
        donViTaiTroPage.verifyThemMoiDonViTaiTroThanhCong(excelHelper.getCellData(12,5));

    }


    @Test(priority = 2)
    public void XoaDonViTaiTro(){
        loginPage = new LoginPage();
        donViTaiTroPage = new DonViTaiTroPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/DonViTaiTroPage.xlsx","XoaDonVi");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        donViTaiTroPage.XoaDonViTaiTro();
        donViTaiTroPage.verifyXoaDonViThanhCong(excelHelper.getCellData(9,5));


    }

    @Test(priority = 3)
    public void ChinhSuaDonViTaiTroThanhCong(){
        loginPage = new LoginPage();
        donViTaiTroPage = new DonViTaiTroPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/DonViTaiTroPage.xlsx","EditDonVI");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        donViTaiTroPage.EditDonViTaiTro(excelHelper.getCellData(8,5),
                                        excelHelper.getCellData(9,5));
        donViTaiTroPage.verifyChinhSuDonViThanhCong(excelHelper.getCellData(11,5));


    }
}
