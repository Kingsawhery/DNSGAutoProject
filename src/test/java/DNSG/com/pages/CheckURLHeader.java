package DNSG.com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import quangtester.com.keywords.WebUI;

public class CheckURLHeader {

    private String URl = "https://saigon-business.erp.meu-solutions.com/auth/login";
    private String PAGETEXT = "Đăng nhập";

    //Page Thới thiệu
    private String URlGioiThieu = "https://saigon-business.erp.meu-solutions.com/gioi-thieu";
    private String PAGEGIOITHIEUTEXT = "Giới Thiệu";
    By headerpagethoithieu = By.xpath(" //span[contains(text(),'Giới thiệu chung')] ");
    By clickpagethoithieu = By.xpath("//header/div[2]/div[1]/div[1]/div[1]/a[1]");

    //9th Monthly B2B
    private String URl9thMonthlyB2B = "https://saigon-business.erp.meu-solutions.com/9th-monthly-b2b";
    private String PAGE9thMonthlyB2BTEXT = "9th Monthly B2B";
    By headerpage9thmonthlyb2b = By.xpath("//p[contains(text(),'9th Monthly B2B')]");
    By clickpage9thmonthlyb2b = By.xpath("//div[1]/div[1]/div[2]/a[1]");

    //Giao Thuong B2B
    private String URlGiaoThuongB2B = "https://saigon-business.erp.meu-solutions.com/giao-thuong-b2b";
    private String PAGEGIAOTHUONGTEXT = "Giao Thương B2B";
    By headerpagegiaothuongb2b = By.xpath("//div[contains(text(),'Lĩnh vực kết nối B2B')]");
    By clickpagegiaothuongb2b = By.xpath("//div[2]/div/div/div[3]/a");

    //Hiệp hội/ Hội/ Câu lạc bộ
    private String URlHoiClb = "https://saigon-business.erp.meu-solutions.com/hiep-hoi-hoi-cau-lac-bo";
    private String PAGEHOICLBTEXT ="Hiệp hội/ Hội/ Câu lạc bộ";
    By headerhoiclb = By.xpath("//h1[contains(text(),'Hiệp hội/ Hội/ Câu lạc bộ')]");
    By clickpagehoiclb = By.xpath("//div[2]/div/div/div[4]/a");

    //Sự kiện đối tác
    private String URlSuKienDoiTac = "https://saigon-business.erp.meu-solutions.com/su-kien-doi-tac";
    private String PAGESUKIENDOITAC = "Sự kiện đối tác";
    By headerpagesukiendoitac = By.xpath("//h1[contains(text(),'Sự kiện sắp diễn ra')]");
    By clickpagesukiendoitac = By.xpath("//div[1]/div[5]/a[1]");

    //Liên hệ
    private String URlLienHe = "https://saigon-business.erp.meu-solutions.com/lien-he";
    private String PAGELIENHETEXT = "Liên hệ";
    By headerpagelienhe = By.xpath("//div[contains(text(),'Liên hệ với chúng tôi')]");
    By clickpagelienhe = By.xpath("//div[1]/div[6]/a[1]");


    public void checkURLGioiThieu(String PageGioiThieu){
        WebUI.clickElement(clickpagethoithieu);
        WebUI.sleep(2);
        boolean urltrue = WebUI.getCurrentUrl().equals(PageGioiThieu);
        Assert.assertTrue(urltrue,"URL không đúng");
    }

    public void checkURL9thmonthlyb2b(String Page9thmonthlyb2b){
        WebUI.clickElement(clickpage9thmonthlyb2b);
        WebUI.sleep(2);
        boolean urltrue = WebUI.getCurrentUrl().equals(Page9thmonthlyb2b);
        Assert.assertTrue(urltrue,"URL không đúng");
    }

    public void checkURLGiaoThuongB2B(String PageGiaoThuongB2B){
        WebUI.clickElement(clickpagegiaothuongb2b);
        WebUI.sleep(2);
        boolean urltrue = WebUI.getCurrentUrl().equals(PageGiaoThuongB2B);
        Assert.assertTrue(urltrue,"URL không đúng");
    }

    public void checkURLHiepHoiHoiClb(String PageHoiClb){
        WebUI.clickElement(clickpagehoiclb);
        WebUI.sleep(2);
        boolean urltrue = WebUI.getCurrentUrl().equals(PageHoiClb);
        Assert.assertTrue(urltrue,"URL không đúng");
    }

    public void checkURLSuKienDoiTac(String PageSuKienDoitac){
        WebUI.clickElement(clickpagesukiendoitac);
        WebUI.sleep(2);
        boolean urltrue = WebUI.getCurrentUrl().equals(PageSuKienDoitac);
        Assert.assertTrue(urltrue,"URL không đúng");
    }

    public void checkURLLienHe(String PageLienHe){
        WebUI.clickElement(clickpagelienhe);
        WebUI.sleep(2);
        boolean urltrue = WebUI.getCurrentUrl().equals(PageLienHe);
        Assert.assertTrue(urltrue,"URL không đúng");
    }
}
