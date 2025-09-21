package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_form {
	
	public Address_form(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Add Address')]")
	private WebElement Addaddress;
	
	@FindBy(id="Home")
	private WebElement homebutton;
	
	@FindBy(id="Name")
	private WebElement Name;
	
	@FindBy(id="House/Office Info")
	private WebElement houseno;
	
	@FindBy(id="Street Info")
	private WebElement street;
	
	@FindBy(id="Landmark")
	private WebElement Landmark;
	
	@FindBy(id="Country")
	private WebElement country;
	
	@FindBy(id="State")
	private WebElement state;
	
	@FindBy(id="City")
	private WebElement city;
	
	@FindBy(id="Pincode")
	private WebElement pincode;
	
	@FindBy(id="Phone Number")
	private WebElement phonenumber;
	
	@FindBy(id="addAddress")
	private WebElement addaddressbtn;
	
	@FindBy(xpath="//button[@aria-label='close']")
	private WebElement popupclose;

	public WebElement getPopupclose() {
		return popupclose;
	}

	public WebElement getAddaddress() {
		return Addaddress;
	}

	public WebElement getHomebutton() {
		return homebutton;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getHouseno() {
		return houseno;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getLandmark() {
		return Landmark;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getAddaddressbtn() {
		return addaddressbtn;
	}
}
