package cucumber.miniproject;

import java.io.IOException;

import com.adactin.baseclass.Base_class;
import com.adactin.sdp.PageObjectManager;

public class Adactin_hotel extends Base_class {
	public static void main(String[] args) throws IOException {

		getBrowser("chrome");
		implicitWait();

		getUrl("https://adactinhotelapp.com/");

		PageObjectManager pom = new PageObjectManager(driver);

		inputValueElement(pom.getHp().getName(), "Raguraguragu");
		inputValueElement(pom.getHp().getPassword(), "SWVN83");
		clickOnElement(pom.getHp().getLogin());

		dropDown(pom.getSh().getLocation(), "byVisibleText", "Paris");
		dropDown(pom.getSh().getHotels(), "byVisibleText", "Hotel Hervey");
		dropDown(pom.getSh().getRoomtype(), "byVisibleText", "Standard");
		dropDown(pom.getSh().getRoomnos(), "byVisibleText", "3 - Three");
		clearTextBox(pom.getSh().getDatein());
		inputValueElement(pom.getSh().getDatein(), "01/05/2022");
		clearTextBox(pom.getSh().getDateout());
		inputValueElement(pom.getSh().getDateout(), "05/05/2022");
		dropDown(pom.getSh().getAdult(), "byVisibleText", "1 - One");
		dropDown(pom.getSh().getChild(), "byVisibleText", "0 - None");
		clickOnElement(pom.getSh().getSubmit());

		clickOnElement(pom.getSl().getRadio());
		clickOnElement(pom.getSl().getCont_inue());

		inputValueElement(pom.getBh().getFirstname(), "Ragu");
		inputValueElement(pom.getBh().getLastname(), "Venkat");
		inputValueElement(pom.getBh().getTxtarea(), "India");
		inputValueElement(pom.getBh().getCcnum(), "1234123412341234");
		dropDown(pom.getBh().getCctype(), "byVisibletext", "VISA");
		dropDown(pom.getBh().getExpmonth(), "byVisibletext", "May");
		dropDown(pom.getBh().getExpyear(), "byVisibletext", "2022");
		inputValueElement(pom.getBh().getCvv(), "008");
		clickOnElement(pom.getBh().getBooknow());
		screenShot("C:\\Users\\Change-This-Username\\eclipse-workspace\\AdactinCucumber\\Screenshot.screenshot.png");

		clickOnElement(pom.getLo().getLogout());
		screenShot("C:\\Users\\Change-This-Username\\eclipse-workspace\\AdactinCucumber\\Screenshot.screenshot1.png");
	}

}
