package DNSG.com.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.Assert;
import quangtester.com.keywords.WebUI;

public class HoiClbPage {
    private String URL = "https://saigon-business.erp.meu-solutions.com/admin/partner";
    private String PAGETEXT = "Quản lý Hiệp hội/Hội/CLB";


    //page add HoiCLB
    private String PAGE_URL_HOICLBADMIN = "https://saigon-business.erp.meu-solutions.com/admin/club";
    private String PAGE_TEXT_THEMHOICLB = "Thông tin Hiệp hội/Hội/CLB";



    //Thêm mới Hội Clb
    By clickpagehoiclbadmin = By.xpath("//div/div/div/ul/div[5]/div");
    By buttonthemmoihoiclb = By.xpath("//main/div/div[1]/div/button");
    By logohoiclb = By.xpath("//div[2]/div/div[1]/label");
    By tenhoiclb = By.xpath("//div/div[2]/div/input");
    By emailhoiclb = By.xpath("//div/div[3]/div/input");
    By chieckhau = By.xpath("//div/div[4]/div/input");
    By btnluuhoiclb = By.xpath("//div[3]/div[1]/div[3]/button[2]");
    public void ThemMoiHoiClB(String TenHoiClb, String EmailHoi, String ChietKhau){
        WebUI.clickElement(clickpagehoiclbadmin);
        WebUI.clickElement(buttonthemmoihoiclb);
        WebUI.clickElement(logohoiclb);
        WebUI.uploadFileRobotClass("D:\\Code_Automation\\ProjectAutomation_DNSG-main\\src\\main\\resources\\datatest\\img5.png");
        WebUI.setText(tenhoiclb ,TenHoiClb);
        WebUI.setText(emailhoiclb,EmailHoi);
        WebUI.setText(chieckhau,ChietKhau);
        WebUI.clickElement(btnluuhoiclb);
        WebUI.sleep(1.5);
    }
    By messageThemHoiThanhCong = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    public void veriifyThemHoiThanhCong(String messageThemHoiClbthanhcong){
        boolean MessageThemHoiThanhCong = WebUI.getTextElement(messageThemHoiThanhCong).equals(messageThemHoiClbthanhcong);
        Assert.assertTrue(MessageThemHoiThanhCong,"Fail");
    }



    //Xóa Hội Clb
    By btnXoaHoiClb = By.xpath("//div[2]/div/div[2]/div/div[3]/div[10]/div/button[2]");
    By doituongHoi = By.xpath("//div/div[2]/div/div/div[2]/div/div[2]/div/div[1]");
    By popupXoaHoiClb = By.xpath("//div/div[2]/button[2]");

    public void XoaHoiClb(){
        WebUI.clickElement(clickpagehoiclbadmin);
        WebUI.clickElement(doituongHoi);
        WebUI.clickElement(btnXoaHoiClb);
        WebUI.clickElement(popupXoaHoiClb);
        WebUI.sleep(1);
    }

    By messageXoaHoi = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    public void verifyXoaHoiThanhCong(String messageXoaHoiClb){
        boolean MessageXoaHoiThanhCong = WebUI.getTextElement(messageXoaHoi).equals(messageXoaHoiClb);
        Assert.assertTrue(MessageXoaHoiThanhCong,"Fail");
    }


    //Chỉnh Sửa Hội Clb
    By iconedithoi = By.xpath("//div[2]/div/div[2]/div/div[3]/div[10]/div/button[1]");
    By btnLuutrongEditHoi = By.xpath("//div/div[3]/button[2]");

    public void EditHoiClb(String EditTenHoi, String EditEmailHoi, String EditChietKhau){
        WebUI.clickElement(clickpagehoiclbadmin);
        WebUI.clickElement(iconedithoi);
        WebUI.setText(tenhoiclb,EditTenHoi);
        WebUI.setText(emailhoiclb,EditEmailHoi);
        WebUI.setText(chieckhau,EditChietKhau);
        WebUI.clickElement(btnluuhoiclb);
        WebUI.sleep(1.5);

    }
    By messageChinhSuaHoi = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    public void verifyChinhSuaThanhCong(String messageEditHoithanhcong){
        boolean MessageChinhSuHoi = WebUI.getTextElement(messageChinhSuaHoi).equals(messageEditHoithanhcong);
        Assert.assertTrue(MessageChinhSuHoi,"Fail");
    }

}
