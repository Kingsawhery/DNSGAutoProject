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
       loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                excelHelper.getCellData(3,5));

       hoiClbPage.ThemMoiHoiClB(excelHelper.getCellData(8,5),
                                excelHelper.getCellData(9,5),
                                excelHelper.getCellData(10,5));
       hoiClbPage.veriifyThemHoiThanhCong(excelHelper.getCellData(13,5));
    }
<<<<<<< HEAD
    @Test(priority = 4)
    public void AddnewEvent(){
        loginPage =new LoginPage();
        hoiClbPage = new HoiClbPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/LoginPage.xlsx","AccountUser");
        loginPage.LoginAccHoi(excelHelper.getCellData(14,5),
                              excelHelper.getCellData(15,5));
        excelHelper.setExcelFile("src/main/resources/datatest/HoiClb.xlsx","AddNewEvent");
        hoiClbPage.AddNewEventHoi(excelHelper.getCellData("NameEvent",1),
                                  excelHelper.getCellData("AddressEvent",1),
                                  excelHelper.getCellData("Description",1),
                                  excelHelper.getCellData("DescriptionEvent",1));
        //hoiClbPage.verifyAddNewEventSucess(excelHelper.getCellData("NameEvent",1),"NameEvent")
        hoiClbPage.veriifyThemHoiThanhCong1("Thao tác thành công");
        //hoiClbPage.verifyAddNewEventSucess();




    }


































=======
>>>>>>> developerII


    @Test(priority = 2)
    public void XoaHoiClb(){
        loginPage = new LoginPage();
        hoiClbPage = new HoiClbPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/HoiClb.xlsx","XoaHoiClb");
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
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),
                                 excelHelper.getCellData(3,5));
        hoiClbPage.EditHoiClb(excelHelper.getCellData(8,5),
                            excelHelper.getCellData(9,5),
                            excelHelper.getCellData(10,5));
        hoiClbPage.verifyChinhSuaThanhCong(excelHelper.getCellData(13,5));
    }
}
