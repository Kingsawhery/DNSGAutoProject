package DNSG.com.pages;
import static quangtester.com.keywords.WebUI.*;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import quangtester.com.helpers.ExcelHelper;
import org.openqa.selenium.support.ui.Select;
import quangtester.com.keywords.WebUI;

import java.util.List;

public class AddNewEventPage {

    By positionField = By.xpath("//input[@name='contactTitle']");
    By nextButton = By.xpath("//button[contains(text(),'Tiếp theo')]");
    By eventNameDropdown = By.xpath("//div/div/div/div[2]/div[3]/div/div[1]/div/div");
    By eventNameSelect = By.xpath("//ul[@role='listbox']/descendant::li");
    //By listEventsName = By.xpath("//ul[@id=':r10:']/descendant::li");
        By finishedButton = By.xpath("(//button[normalize-space()='Hoàn thành'])[1]");
    By button9thMonthlyButton = By.xpath("//a[@href='/9th-monthly-b2b']");
    By buttonRegisterBooth = By.xpath("//button[contains(text(),'Đăng ký gian hàng')]");
    public void addEvent(String position){
        WebUI.clickElement(button9thMonthlyButton);
        WebUI.scrollToElementWithJS(buttonRegisterBooth);
        WebUI.clickElementWithJS(buttonRegisterBooth);
        WebUI.setText(positionField,position);
        WebUI.scrollToElementWithJS(nextButton);
        WebUI.clickElementWithJS(nextButton);
        WebUI.clickElement(eventNameDropdown);
        clickSelectItem(eventNameSelect);
        WebUI.waitForElementVisible(finishedButton);
        WebUI.scrollToElementWithJS(finishedButton);
        WebUI.clickElementWithJS(finishedButton);

    }
    public void clickSelectItem(By listItems){
        List<WebElement> listItemElements = WebUI.getWebElements(listItems);
        listItemElements.get(0).click();
        //Select items

    }
By messageAddNewSuccess = By.xpath("//div[contains(text(),'Đăng ký thành công!')]");
    public  void verifyAddNewEventSuccess(){
        waitForPageLoaded();
        waitForElementVisible(messageAddNewSuccess,20);

    }
}
