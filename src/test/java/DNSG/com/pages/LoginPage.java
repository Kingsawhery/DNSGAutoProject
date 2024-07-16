package DNSG.com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import quangtester.com.keywords.WebUI;

public class LoginPage {
    private String URl = "https://saigon-business.erp.meu-solutions.com/dang-nhap";
    private String PAGETEXT = "Đăng nhập";


    By headerPage = By.xpath("//div[@class='text-");
    By inputEmail = By.xpath("//input[@id='email']");
    By inputPassword = By.xpath("//form/div[3]/div/input");
    By buttonLogin = By.xpath("//form/div[5]/button");
    By messageErrorEmail = By.xpath("//p[@id='email-helper-text']");
    By getMessageErrorPassword = By.xpath("//p[@id=':rd:-helper-text']");
    By tatpopup = By.xpath("//body/div[2]/div[3]/div[1]/div[1]/button[1]/*[1]");





    public void LoginThanhCong (String email,String password){
       WebUI.openURL(URl);
       WebUI.setText(inputEmail,email);
       WebUI.setText(inputPassword,password);
       WebUI.clickElement(buttonLogin);
       WebUI.sleep(1.5);
   }

   public void LoginUserCheckSuKien(String email_user, String password_user){
       WebUI.openURL(URl);
       WebUI.setText(inputEmail,email_user);
       WebUI.setText(inputPassword,password_user);
       WebUI.clickElement(buttonLogin);
       WebUI.sleep(1.5);
   }



   By messageSuccess = By.xpath("//div[contains(text(),'Đăng nhập thành công')]");
   public void  verifyLoginThanhCong(String messageloginthanhcong){
       boolean ketquamongmuon = WebUI.getTextElement(messageSuccess).trim().equals(messageloginthanhcong);
       Assert.assertTrue(ketquamongmuon,"Fail");
   }

    public void LoginThatBai (String email,String password){
        WebUI.openURL(URl);
        WebUI.setText(inputEmail,email);
        WebUI.setText(inputPassword,password);
        WebUI.clickElement(buttonLogin);
        WebUI.sleep(2);
    }

   By messageFailed = By.xpath("//div[contains(text(),'Email hoặc mật khẩu không đúng')]");
   public void verifyLoginThatBai(String messageloginthatbai){
       boolean ketquamongmuon = WebUI.getTextElement(messageFailed).trim().equals(messageloginthatbai);
       Assert.assertTrue(ketquamongmuon,"Fail");
   }
   public void LoginAccHoi(String email,String password){
       WebUI.openURL(URl);
       WebUI.setText(inputEmail,email);
       WebUI.setText(inputPassword,password);
       WebUI.clickElement(buttonLogin);
       WebUI.sleep(1.5);
   }

}
