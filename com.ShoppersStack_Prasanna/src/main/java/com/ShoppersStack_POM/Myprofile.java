package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myprofile {
	
	public Myprofile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'My Addresses')]")
	private WebElement Myaddressbtn;
	
	public WebElement getMyaddressbtn() {
		return Myaddressbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getYesbtn() {
		return yesbtn;
	}

	@FindBy(xpath="(//span[@class='MuiButton-startIcon MuiButton-iconSizeSmall css-u0g51i'])[2]")
	private WebElement deletebtn;
	
	@FindBy(xpath="//button[contains(text(), 'Yes')]")
	private WebElement yesbtn;
	
	
}
