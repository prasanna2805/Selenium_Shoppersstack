package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'MuiAvatar-root MuiAvatar-circular ')]")
	private WebElement profilebtn;

	@FindBy(xpath = "//li[contains(text(),'My Profile')]")
	private WebElement myprofile;

	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutbtn;

	public WebElement getProfilebtn() {
		return profilebtn;
	}

	public WebElement getMyprofile() {
		return myprofile;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

}
