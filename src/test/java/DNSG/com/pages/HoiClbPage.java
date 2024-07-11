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
    By clickXbutton =By.xpath("//*[name()='path' and contains(@d,'M19 6.41 1')]");
    //Create event cho hoi
    By clickOnAccText =By.xpath("//span[@class='text-base font-semibold text-app-blue leading-normal']");
    By clickOnInForAcc =By.xpath("//li[contains(text(),'Thông tin tài khoản')]");
    By clickOnInforEvent = By.xpath("//span[contains(text(),'Thông tin sự kiện')]");
    By clickOnAddNewButton =By.xpath("//button[contains(text(),'Thêm mới')]");
    By UploadPhoto=By.xpath("//label[@role='button']");
    By inputNameEventTextbox =By.xpath("//div/div[2]/div/div[2]/div/input");
    By inputAddressEventTextbox =By.xpath("//div[3]/div[3]/div/div[2]/div/div[3]/div/input");
    By clickOnDateTextbox =By.xpath("//button[@aria-label='Chọn ngày']//*[name()='svg']");
    By selectDateEvent=By.xpath("//button[normalize-space()='26']");
    By scrolldownDesTextbox =By.xpath("//div[3]/div[3]/div/div[2]/div/div[3]/label");
    By clickOnStartTimeTextbox=By.xpath("//div[3]/div[3]/div/div[2]/div/div[5]/div/div/button");
    By clickOnStartTimeHourTextbox =By.xpath("//li[@aria-label='1 giờ']");
    By clickOnStartTimeMinTextbox=By.xpath("//li[@aria-label='15 phút']");
    By clickOnEndTimeTextbox =By.xpath("//div[3]/div[3]/div/div[2]/div/div[6]/div/div/button");
    By clickOnEndTimeHour=By.xpath("//li[@aria-label='4 giờ']");
    By clickOnEndTimeMin=By.xpath("//li[@aria-label='20 phút']");
    By inputDescriptionTextbox=By.xpath("//div[3]/div[3]/div/div[2]/div/div[7]/div/textarea[1]");
    By inputDecriptionEventTextbox=By.xpath("//div[@class='jodit-wysiwyg']");
    By clickOnSaveButton =By.xpath("//div[3]/div[3]/div/div[3]/button[2]");
    By clickOnEventTab= By.xpath("//main/header/div[2]/div/div/div[5]/a");
   // By VerifyNameEvent=By.xpath("//a[normalize-space()='']");
    By scrollDownSuKienCheck =By.xpath("//h1[contains(text(),'Sự kiện đã diễn ra')]");
    By getTextNoty = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    //Hàm thêm mới sự kien
    public void AddNewEventHoi(String NameEvent, String AddressEvent,String Description, String DescriptionEvent){
        WebUI.clickElement(clickOnAccText);
        WebUI.clickElement(clickOnInForAcc);
        WebUI.clickElement(clickOnInforEvent);
        WebUI.clickElement(clickOnAddNewButton);
        WebUI.clickElement(UploadPhoto);
        WebUI.uploadFileRobotClass("D:\\automation_selenium\\ProjectAutomation_DNSG-I-main\\src\\main\\resources\\datatest\\img5.png");
        WebUI.setText(inputNameEventTextbox,NameEvent);
        WebUI.scrollToElementWithJS(scrolldownDesTextbox);
        WebUI.setText(inputAddressEventTextbox,AddressEvent);
        WebUI.clickElement(clickOnDateTextbox);
        WebUI.clickElement(selectDateEvent);
        WebUI.clickElement(clickOnStartTimeTextbox);
        WebUI.clickElement(clickOnStartTimeHourTextbox);
        WebUI.clickElement(clickOnStartTimeMinTextbox);
        WebUI.clickElement(clickOnEndTimeTextbox);
        WebUI.clickElement(clickOnEndTimeHour);
        WebUI.clickElement(clickOnEndTimeMin);
        WebUI.setText(inputDescriptionTextbox,Description);
        WebUI.setText(inputDecriptionEventTextbox,DescriptionEvent);
        WebUI.clickElement(clickOnSaveButton);
      //  WebUI.verifyElementText(getTextNoty,"Thao tác thành công", "sự kiện khong duoc tao");
        WebUI.sleep(2);
    }
    By messageThemHoiThanhCong1 = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    public void veriifyThemHoiThanhCong1(String messageThemHoiClbthanhcong1){
        boolean MessageThemHoiThanhCong = WebUI.getTextElement(messageThemHoiThanhCong1).equals(messageThemHoiClbthanhcong1);
        Assert.assertTrue(MessageThemHoiThanhCong,"Fail");
    }

    public void verifyAddNewEventSucess(){
        //WebUI.clickElement(clickOnEventTab);
      //  WebUI.scrollToElementWithJS(scrollDownSuKienCheck);
       // WebUI.verifyElementText(getVerifyNameEvent,AddressEvent,"Khong co su kien nao");
        WebUI.verifyElementText(getTextNoty,"Thao tác thành công", "sự kiện khong duoc tac");

    }

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
