package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_credentials {

	public User_credentials(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginBtn")
	private WebElement loginuser;

	public WebElement getLoginuser() {
		return loginuser;
	}

}
