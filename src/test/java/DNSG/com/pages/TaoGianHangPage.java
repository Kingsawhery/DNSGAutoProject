package DNSG.com.pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import quangtester.com.keywords.WebUI;

public class TaoGianHangPage {
    private String URLPAGETAOGIANHANG = "https://saigon-business.erp.meu-solutions.com/thong-tin-tai-khoan/doanh-nghiep/gian-hang";

    //My Account
    By myaccount = By.xpath("//div[1]/main/div/div/section/div/div/div/div/span");
    By ThongTinTaiKhoan = By.xpath("//li[contains(text(),'Thông tin tài khoản')]");
    By Thongtingianhang = By.xpath("//div[1]/ul/div[2]/div/div[2]/span");
    By buttonChinhSuGianHang = By.xpath("//div/div[2]/div/div[3]/button");

    public void TaogianhangUser(){
        WebUI.clickElement(myaccount);
        WebUI.clickElement(ThongTinTaiKhoan);
        WebUI.clickElement(Thongtingianhang);
        WebUI.clickElement(buttonChinhSuGianHang);
        WebUI.sleep(2);
    }

    By pageQuanLyGianHang = By.xpath("//div/ul/div[6]/div/div[2]/span");
    By btnDuyetGianHang = By.xpath("//div/div[2]/div/div[2]/div/div/div[7]/div/button");
    By btnPheDuyet = By.xpath("//div/div/main/div/div[2]/div[7]/button[1]");
    public void DuyetGianHang(){
        WebUI.clickElement(pageQuanLyGianHang);
        WebUI.clickElement(btnDuyetGianHang);
        WebUI.clickElementWithJS(btnPheDuyet);
        WebUI.clickElement(btnPheDuyet);
        WebUI.sleep(2);

    }

}
