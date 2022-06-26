package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	@FindBy(css = "[type='radio']")

	private WebElement radio;
	
	@FindBy(css = "[name='continue']")
	private WebElement cont_inue;

	public Select_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont_inue() {
		return cont_inue;
	}

}
