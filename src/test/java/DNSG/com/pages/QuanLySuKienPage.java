package DNSG.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import quangtester.com.drivers.DriverManager;
import quangtester.com.keywords.WebUI;

import java.util.List;

public class QuanLySuKienPage {
    private String URL = "https://saigon-business.erp.meu-solutions.com/admin/event";
    private String PAGE_TEXT = "Quản lí sự kiện";

    By pageQLSK = By.xpath("//div/div/div/ul/div[3]/div");
    By pageSuKienB2B = By.xpath("//div[2]/div/div/div/div[3]/div/span");


    private String URLQLSK = "https://saigon-business.erp.meu-solutions.com/admin/event/b2b-event";
    private String PageText = "Sự kiện B2B";


    //Thêm Mới Một Sự Kiện B2B
    By btnThemMoiSK = By.xpath("//div[2]/div/div[1]/div/button");
    By avtSuKieb = By.xpath("//div[3]/div/div[1]/div/div[1]/label");
    By tensukien = By.xpath("//div/div[1]/div/div[3]/div/input");
    By ngaydienrasukien = By.xpath("//div[1]/div/div[4]/div/input");
    By btnlichSK = By.xpath("//div/div[1]/div/div[4]/div/div/button");
    By thoigianbatdauSK = By.xpath("//div/div[1]/div/div[5]/div/input");
    By thoigianketthucSK = By.xpath("//div[1]/div/div[6]/div/input");
    By btnselectthoigianbatdau = By.xpath("//div[1]/div/div[5]/div/div/button");
    By btnselectthoigianketthuc = By.xpath("//div/div[1]/div/div[6]/div/div/button");
    By popupChonNgayDienra = By.xpath("//div/div/div/div[2]/div/div/div[2]/div/div[5]/button[7]");
    By HOUR = By.xpath("//li[@aria-label='4 giờ']");
    By MINUTE = By.xpath("//li[@aria-label='10 phút']");
    By HOURTGKT = By.xpath("//li[@aria-label='10 giờ']");
    By MINUTETGKT = By.xpath("//li[@aria-label='10 phút']");
    By SelectTinhThanhPho = By.xpath("//div/div/main/div/div[3]/div/div[2]/div/div[2]/div/div");
    By tinh = By.xpath("//li[normalize-space()='Khánh Hòa']");
    By diemdiem = By.xpath("//div[2]/div/div[3]/div/input");
    By gioithieumotangan = By.xpath("//textarea[@id=':r23:']");
    By gioithieuchung = By.xpath("//div/div[3]/div[2]/div[2]/div/div[2]/div[1]");
    By btnLuuSKnew = By.xpath("//div/div/main/div/div[7]/button[2]");
    public void ThemMoiSuKien(String TenSuKien, String DiaDiem, String GioiThieuNgan, String GioiThieuChung  ) {
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);
        WebUI.clickElement(btnThemMoiSK);

        //Logo
        WebUI.clickElement(avtSuKieb);
        WebUI.uploadFileRobotClass("D:\\Code_Automation\\ProjectAutomation_DNSG-main\\src\\main\\resources\\datatest\\img7.png");
        WebUI.uploadFileRobotClass("D:\\Code_Automation\\ProjectAutomation_DNSG\\src\\main\\resources\\datatest\\img7.png");

        //Tên sự kiện
        WebUI.setText(tensukien,TenSuKien);

        //ngày diễn ra
        WebUI.clickElement(ngaydienrasukien);
        WebUI.clickElement(btnlichSK);
        WebUI.clickElement(popupChonNgayDienra);

        //thời gian bắt đâu
        WebUI.clickElement(thoigianbatdauSK);
        WebUI.clickElement(btnselectthoigianbatdau);
        WebUI.clickElement(HOUR);
        WebUI.clickElement(MINUTE);

        //thời gian kết thúc
        WebUI.clickElement(btnselectthoigianketthuc);
        WebUI.scrollToElementWithJS(HOURTGKT);
        WebUI.clickElementWithJS(HOURTGKT);
        WebUI.clickElementWithJS(MINUTETGKT);

        //địa điểm
        WebUI.clickElement(SelectTinhThanhPho);
        WebUI.clickElementWithJS(tinh);
        WebUI.setText(diemdiem,DiaDiem);

        //Giới thiệu
        WebUI.setText(gioithieumotangan,GioiThieuNgan);

        //Giới thiệu chung
        WebUI.setText(gioithieuchung,GioiThieuChung);

        //Click Button Lưu Sự Kiện
        WebUI.scrollToElementWithJS(btnLuuSKnew);
        WebUI.clickElement(btnLuuSKnew);
        WebUI.sleep(2);

    }

    By MessagethemmoiSKthanhcong = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    public void verifyThemMoiSuKienThanhCong(String messageThemSKthanhcong) {
        boolean MessageThemSuKienThanhCong = WebUI.getTextElement(MessagethemmoiSKthanhcong).equals(messageThemSKthanhcong);
        Assert.assertTrue(MessageThemSuKienThanhCong,"Fail");
    }


    //Chỉnh sửa Sự Kiện B2B
    By editngaydienraSK = By.xpath("//div/div/div[2]/div/div/div[2]/div/div[1]/button[1]");
    By btnEditSK = By.xpath("//div/div/div[2]/div/div[2]/div/div[1]/div[8]/div/button[1]");
    //By doituongedit = By.xpath("//div/div[2]/div/div/div[2]/div/div[2]/div/div[1]");
    By editgiobatdau = By.xpath("//li[@aria-label='8 giờ']");
    By editphutbatdau = By.xpath("//li[@aria-label='10 phút']");
    By editgioketthuc = By.xpath("//li[@aria-label='16 giờ']");
    By editphutketthuc = By.xpath("//li[@aria-label='10 phút']");
    By editTinh = By.xpath("li[normalize-space()='Bình Định']");
    By MesageEditSKthanhcong = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    public void ChinhSuaSuKien(String tenskedit, String EditDiaDiem, String Editmotangan, String Editgioithieuchung) {
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);
        //WebUI.clickElement(doituongedit);
        WebUI.clickElement(btnEditSK);

        //Edit ten su kien
        WebUI.setText(tensukien,tenskedit);


        //Edit ngay dien ra
        WebUI.clickElement(ngaydienrasukien);
        WebUI.clickElement(btnlichSK);
        WebUI.clickElement(editngaydienraSK);

        //Edit thời gian bắt đâu
        WebUI.clickElement(thoigianbatdauSK);
        WebUI.clickElement(btnselectthoigianbatdau);
        WebUI.clickElementWithJS(editgiobatdau);
        WebUI.clickElementWithJS(editphutbatdau);

        //edit thoi gian ket thuc
        WebUI.clickElement(btnselectthoigianketthuc);
        WebUI.scrollToElementWithJS(editgioketthuc);
        WebUI.clickElementWithJS(editgioketthuc);
        WebUI.clickElementWithJS(editphutketthuc);

        //địa diểm
        WebUI.clickElement(SelectTinhThanhPho);
        WebUI.clickElementWithJS(tinh);
        WebUI.setText(diemdiem,EditDiaDiem);

        //Edit Giới thiệu
        WebUI.getWebElement(gioithieumotangan).clear();
        WebUI.setText(gioithieumotangan,Editmotangan);

        //Edit Giới thiệu chung
        WebUI.getWebElement(gioithieuchung).clear();
        WebUI.setText(gioithieuchung,Editgioithieuchung);


        //Edit Click Button Lưu Sự Kiện
        WebUI.scrollToElementWithJS(btnLuuSKnew);
        WebUI.clickElement(btnLuuSKnew);
        WebUI.sleep(2);
    }
    public void verifyMessageEditSuKienThanhCong (String messageEditthanhcong){
        boolean Editthanhcong = WebUI.getTextElement(MesageEditSKthanhcong).equals(messageEditthanhcong);
        Assert.assertTrue(Editthanhcong,"Fail");
    }



    //Xóa Sự Kiên B2B
    By doituongcanxoa = By.xpath("//div[2]/div/div/div[2]/div/div[2]/div/div[6]");
    By btnXoaSK = By.xpath("//div/div[2]/div/div[2]/div/div[3]/div[8]/div/button[2]");
    By popupXoaSK = By.xpath("//div/div[2]/button[2]");
    public void XoaSuKien() {
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);
        WebUI.clickElement(doituongcanxoa);
        WebUI.clickElement(btnXoaSK);
        WebUI.clickElement(popupXoaSK);
    }
    By tableListEvent = By.xpath("//div[@role='rowgroup']/div[@role='row']");
    By eachColumnRow = By.xpath("//div[@role='rowgroup']/div[@role='row']/div");
    By tabEventHappening = By.xpath("//button[contains(text(), 'Đang diễn ra')]");
    public void verifyEvent(){
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);
        WebUI.clickElement(tabEventHappening);
        WebUI.waitForElementVisible(tableListEvent);
        checkColumn("Viết máy");
        WebUI.sleep(10);
    }
    public void checkColumn(String eventName){
        WebUI.waitForElementVisible(tableListEvent);
        List<WebElement> listB2B = WebUI.getWebElements(tableListEvent);
        for(WebElement event : listB2B){
            List<WebElement> list = event.findElements(By.xpath("./div"));
            WebElement elementTarget;
                int i;
                for( i = 3; i < list.size(); i+=8){

                    if(list.get(i).getText().equals(eventName)){

                        System.out.println("Đã tìm thấy item cần tìm ở vị trí: " + list.get(i-2).getText());
                    }else{

                    }
                }

        }
    }


    By MessageXoaSKthanhcong = By.xpath("//div[contains(text(),'Thao tác thành công')]");

    public void verifyMessageXoaSuKien (String messageXoathanhcong){
        boolean xoathanhcong = WebUI.getTextElement(MessageXoaSKthanhcong).equals(messageXoathanhcong);
        Assert.assertTrue(xoathanhcong,"Fail");
    }



//    public void checkSearchTableByColumn(String value) {
//        //Xác định số dòng của table sau khi search
//        List<WebElement> row = DriverManager.getDriver().findElements(By.xpath("//div/div[2]/div/div[2]/div/div/div[1]/div[2]"));
//        int rowTotal = row.size(); //Lấy ra số dòng
//        System.out.println("Số dòng tìm thấy: " + rowTotal);
//
//        //Duyệt từng dòng
//        for (int i = 1; i <= rowTotal; i++) {
//            WebElement elementCheck = DriverManager.getDriver().findElement(By.xpath("//div[2]/div/div/div["+i+"]/div[3]/div"));
//
//            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//            js.executeScript("arguments[0].scrollIntoView(true);", elementCheck);
//
//            Boolean ColumnValue = elementCheck.getText().toUpperCase().equals(value.toUpperCase());
//            System.out.println("Text của hàng này là: " + elementCheck.getText());
//            if (ColumnValue == true) {
//                System.out.println("Đã tìm thấy giá trị");
//                break;
//            }
//            else if (i == rowTotal){
//                System.out.println("Không tìm thấy giá trị");
//                Assert.fail("Đã tìm hết mà không thấy tên sự kiện mong muốn");
//            }
//        }
//    }
//
//    private final By clickDangDienRaTab = By.xpath("//div/main/div/div[1]/div/div/button[2]");
//    public void GotoQuanLiSuKienPage(){
//        WebUI.clickElement(pageQLSK);
//        WebUI.clickElement(pageSuKienB2B);
//    }
}
