package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginbtn;
	
	@FindBy(id = "Email")
	private WebElement enteremailid;

	@FindBy(id = "Password")
	private WebElement enterpassword;

	public WebElement getEnteremailid() {
		return enteremailid;
	}

	public WebElement getEnterpassword() {
		return enterpassword;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}