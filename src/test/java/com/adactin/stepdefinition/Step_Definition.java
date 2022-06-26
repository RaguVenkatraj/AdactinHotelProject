package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_class;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.runner.Runner_Class;
import com.adactin.sdp.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_class {
	
	public static WebDriver driver = Runner_Class.driver;
	
	public static PageObjectManager pom = new PageObjectManager(driver);

@Given("^user Launch The Application$")
public void user_Launch_The_Application() throws Throwable {
	String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
	getUrl(url);
   
}

@When("^user Enter The Username In Username Field$")
public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	
	inputValueElement(pom.getHp().getName(), "Raguraguragu");
   
}

@When("^user Enter The Password In Password Field$")
public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	
	inputValueElement(pom.getHp().getPassword(), "K0AG4V");
   
}

@Then("^user Click The Login Button and It Navigate To The Search Hotel Page$")
public void user_Click_The_Login_Button_and_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
	
	clickOnElement(pom.getHp().getLogin());
   
}

@When("^user Select  location Of The Hotel$")
public void user_Select_location_Of_The_Hotel() throws Throwable {
	dropDown(pom.getSh().getLocation(), "byVisibleText", "Paris");
   
}

@When("^user Select  Name Of The Hotel$")
public void user_Select_Name_Of_The_Hotel() throws Throwable {
	dropDown(pom.getSh().getHotels(), "byVisibleText", "Hotel Hervey");
   
}

@When("^user Select  Roomtype In Hotel$")
public void user_Select_Roomtype_In_Hotel() throws Throwable {
	dropDown(pom.getSh().getRoomtype(), "byVisibleText", "Standard");
   
}

@When("^user Select The Numberofrooms In Hotel$")
public void user_Select_The_Numberofrooms_In_Hotel() throws Throwable {
	dropDown(pom.getSh().getRoomnos(), "byVisibleText", "3 - Three");
   
}

@When("^user Enter the  Checkindate$")
public void user_Enter_the_Checkindate() throws Throwable {
	clearTextBox(pom.getSh().getDatein());
	inputValueElement(pom.getSh().getDatein(), "01/05/2022");
   
}

@When("^user Enter The  Checkoutdate$")
public void user_Enter_The_Checkoutdate() throws Throwable {
	clearTextBox(pom.getSh().getDateout());
	inputValueElement(pom.getSh().getDateout(), "05/05/2022");
   
}

@When("^user Select Adults Per Room$")
public void user_Select_Adults_Per_Room() throws Throwable {
	dropDown(pom.getSh().getAdult(), "byVisibleText", "1 - One");
   
}

@When("^user Select Children Per Room$")
public void user_Select_Children_Per_Room() throws Throwable {
	dropDown(pom.getSh().getChild(), "byVisibleText", "0 - None");
   
}

@Then("^user Click The Search Button And It Will Navigate To Select Hotel Page$")
public void user_Click_The_Search_Button_And_It_Will_Navigate_To_Select_Hotel_Page() throws Throwable {
	clickOnElement(pom.getSh().getSubmit());
}

@When("^user Click The Radio Button To Select Hotel$")
public void user_Click_The_Radio_Button_To_Select_Hotel() throws Throwable {
	clickOnElement(pom.getSl().getRadio());
}

@Then("^user Click Continue Button And It Will Navigate To Book Hotel Page$")
public void user_Click_Continue_Button_And_It_Will_Navigate_To_Book_Hotel_Page() throws Throwable {
	clickOnElement(pom.getSl().getCont_inue());
}

@When("^user Enter The Firstname In Firstname Field$")
public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
	inputValueElement(pom.getBh().getFirstname(), "Ragu");
}

@When("^user Enter The Lastname In Lastname Field$")
public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
	inputValueElement(pom.getBh().getLastname(), "Venkat");
}

@When("^user Enter The Billing Address In Billing Address Field$")
public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	inputValueElement(pom.getBh().getTxtarea(), "India");
}

@When("^user Enter The  Sixteen  Digit Credit Card Number In Respective Filed$")
public void user_Enter_The_Sixteen_Digit_Credit_Card_Number_In_Respective_Filed() throws Throwable {
	inputValueElement(pom.getBh().getCcnum(), "1234123412341234");
}

@When("^user Select The Credit Card Type$")
public void user_Select_The_Credit_Card_Type() throws Throwable {
	dropDown(pom.getBh().getCctype(), "byVisibletext", "VISA");
}

@When("^user Select The Month In Expiry Date Field$")
public void user_Select_The_Month_In_Expiry_Date_Field() throws Throwable {
	dropDown(pom.getBh().getExpmonth(), "byVisibletext", "May");
}

@When("^user Select The Year In Expiry Date Field$")
public void user_Select_The_Year_In_Expiry_Date_Field() throws Throwable {
	dropDown(pom.getBh().getExpyear(), "byVisibletext", "2022");
}

@When("^user Enter The Cvv Number In Respective Field$")
public void user_Enter_The_Cvv_Number_In_Respective_Field() throws Throwable {
	inputValueElement(pom.getBh().getCvv(), "008");
}

@Then("^user Click The Booknow Button And It Will Navigate To Booking Confirmation Page$")
public void user_Click_The_Booknow_Button_And_It_Will_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	clickOnElement(pom.getBh().getBooknow());
}

@Then("^user Click The Logout Button And It Will Logout The User$")
public void user_Click_The_Logout_Button_And_It_Will_Logout_The_User() throws Throwable {
	clickOnElement(pom.getLo().getLogout());
}



}
