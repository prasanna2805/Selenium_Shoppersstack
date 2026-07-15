package Testscripts;

import java.io.IOException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import com.ShoppersStack_POM.Myprofile;

import shoppersStack_Generic_utility.BaseTest;

public class Test_TC_02_Verifyuserisabletodeleteaddressornot extends BaseTest {

	@Test
	public void deleteaddress() throws InterruptedException, IOException {
		Thread.sleep(2000);

		homepage.getProfilebtn().click();
		homepage.getMyprofile().click();

		Myprofile profiles = new Myprofile(driver);
		profiles.getMyaddressbtn().click();
		Thread.sleep(2000);
		profiles.getDeletebtn().click();
		Thread.sleep(2000);
		profiles.getYesbtn().click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert handled");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		webdriverutility.capturewebpagescreenshot(driver);

	}

}
