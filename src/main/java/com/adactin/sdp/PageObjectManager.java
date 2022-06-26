package com.adactin.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactinpom.Booking_Hotel;
import com.adactinpom.Home_page;
import com.adactinpom.Logout;
import com.adactinpom.Search_Hotel;
import com.adactinpom.Select_Hotel;

public class PageObjectManager {


	public static WebDriver driver;
	
	
	private Home_page hp;
	private Search_Hotel sh;
	private Select_Hotel sl;
	private Booking_Hotel bh;
	private Logout lo;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	public Home_page getHp() {
		hp = new Home_page(driver);
		return hp;
	}
	public Search_Hotel getSh() {
		sh = new Search_Hotel(driver);
		return sh;
	}
	public Select_Hotel getSl() {
		sl = new Select_Hotel(driver);
		return sl;
	}
	public Booking_Hotel getBh() {
		bh = new Booking_Hotel(driver);
		return bh;
	}
	public Logout getLo() {
		lo = new Logout(driver);
		return lo;
	}
	
	

}
