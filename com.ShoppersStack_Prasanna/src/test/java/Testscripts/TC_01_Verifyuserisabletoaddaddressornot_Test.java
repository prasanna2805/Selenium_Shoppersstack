package Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_POM.Address_form;
import com.ShoppersStack_POM.Myprofile;

import shoppersStack_Generic_utility.BaseTest;

public class TC_01_Verifyuserisabletoaddaddressornot_Test extends BaseTest {

	@Test
	public void addaddress() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(2000);

		homepage.getProfilebtn().click();
		homepage.getMyprofile().click();

		Myprofile profile = new Myprofile(driver);
		profile.getMyaddressbtn().click();

		Address_form form = new Address_form(driver);
		form.getAddaddress().click();

		form.getHomebutton().click();
		form.getName().sendKeys(utility.loaddatafromExcelfile("Address", 1, 0));
		form.getHouseno().sendKeys(utility.loaddatafromExcelfile("Address", 1, 1));
		form.getStreet().sendKeys(utility.loaddatafromExcelfile("Address", 1, 2));
		form.getLandmark().sendKeys(utility.loaddatafromExcelfile("Address", 1, 3));
		

		webdriverutility.selectbyvalue(form.getCountry(), utility.loaddatafromPropertyfile("country"));
		webdriverutility.selectbyvalue(form.getState(), utility.loaddatafromPropertyfile("state"));
		webdriverutility.selectbyvalue(form.getCity(), utility.loaddatafromPropertyfile("city"));

		form.getPincode().sendKeys(utility.loaddatafromExcelfile("Address", 1, 4));
		form.getPhonenumber().sendKeys(utility.loaddatafromExcelfile("Address", 1, 5));
		form.getAddaddressbtn().click();
		form.getPopupclose().click();
		
		webdriverutility.capturewebpagescreenshot(driver);

	}

}
