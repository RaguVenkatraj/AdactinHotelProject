package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;
	
	public Search_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	@FindBy(name="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(name="room_nos")
	private WebElement roomnos;
	@FindBy(css="#datepick_in")
	private WebElement datein;
	@FindBy(css="#datepick_out")
	private WebElement dateout;
	@FindBy(name="adult_room")
	private WebElement adult;
	@FindBy(name="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}
	

}
