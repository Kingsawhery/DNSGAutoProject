
package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.AddNewEventPage;
import DNSG.com.pages.LoginPage;
import org.testng.annotations.Test;
import quangtester.com.helpers.ExcelHelper;

public class AddNewEventTest extends BaseTest {
    ExcelHelper excelHelper;
    LoginPage loginPage;

    AddNewEventPage addNewEventPage;
    @Test
    public void addNewEventTest() {
        loginPage = new LoginPage();
        excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/main/resources/datatest/AddNewEvent.xlsx","AddNewEvent");
        loginPage.LoginThanhCong(excelHelper.getCellData(2,5),excelHelper.getCellData(3,5));
        addNewEventPage = new AddNewEventPage();
        addNewEventPage.addEvent(excelHelper.getCellData(12,5));
        addNewEventPage.verifyAddNewEventSuccess();

    }
}
