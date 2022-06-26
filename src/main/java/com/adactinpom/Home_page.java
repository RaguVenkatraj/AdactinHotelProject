package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public static WebDriver driver;

	@FindBy(name = "username")

	private WebElement Name;

	@FindBy(name = "password")

	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
