package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.LoginPage;
import DNSG.com.pages.TaoGianHangPage;
import org.testng.annotations.Test;
import quangtester.com.helpers.ExcelHelper;

public class TaoGianHangTest extends BaseTest {
    LoginPage loginPage;
    TaoGianHangPage taoGianHangPage;
    ExcelHelper excelHelper;

    @Test
    public void TaoGianHang(){
        loginPage = new LoginPage();
        taoGianHangPage = new TaoGianHangPage();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        taoGianHangPage.TaogianhangUser();
    }

    @Test
    public void DuyetGianHang(){
        loginPage = new LoginPage();
        taoGianHangPage = new TaoGianHangPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        taoGianHangPage.DuyetGianHang();
    }
}
