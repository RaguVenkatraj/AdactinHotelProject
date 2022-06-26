package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Hotel {
	public static WebDriver driver;
	@FindBy(css = "[name='first_name']")
	private WebElement firstname;
	@FindBy(css = "[name='last_name']")
	private WebElement lastname;
	@FindBy(css = ".txtarea")
	private WebElement txtarea;
	@FindBy(css = "[name='cc_num']")
	private WebElement ccnum;
	@FindBy(css = "#cc_type")
	private WebElement cctype;
	@FindBy(css = "[name='cc_exp_month']")
	private WebElement expmonth;
	@FindBy(css = "[name='cc_exp_year']")
	private WebElement expyear;
	@FindBy(css = "input[name='cc_cvv']")
	private WebElement cvv;
	@FindBy(css="input[name='book_now']")
	private WebElement booknow;
	public Booking_Hotel(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getTxtarea() {
		return txtarea;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	

}
