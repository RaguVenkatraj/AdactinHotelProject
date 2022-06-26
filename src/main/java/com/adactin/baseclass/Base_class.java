package com.adactin.baseclass;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	
	public static   WebDriver driver;
	
	public static String value;
	
	public static WebDriver getBrowser(String type) {      //1--------------------openingbrowser
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Change-This-Username\\eclipse-workspace\\Maven_Project\\Chrome101\\chromedriver.exe");
					
			 driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Change-This-Username\\eclipse-workspace\\Maven_Project\\Chrome101\\chromedriver.exe");
					
			 driver = new FirefoxDriver();
		}	
		
	    driver.manage().window().maximize();             //-------------------windowmaximize
		
		return driver;
	}
	
	public static void getUrl(String url) {             //2---------------------driver.get("")
		
		driver.get(url);

	}
	
	
	public static void clickOnElement(WebElement element) {           //3-----------------click
		
       element.click();
	}
	
	
	public static void inputValueElement(WebElement element,String value) {       //----------sendkeys
		
		element.sendKeys(value);

	}
	 
    public static WebDriver close() {                                               //5-----------closing
    	driver.close();
		return driver;
	}
	 
	public static WebDriver quit() {                                                //6------------quit
		driver.quit();
		return driver;
			
	}
		
		public static  void dropDown(WebElement element,String type,String value) {   //7------dropdown select methos
		
            Select s = new Select(element);
            if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			}
           
            else if (type.equalsIgnoreCase("byIndex")) {
            	int data = Integer.parseInt(value);
				s.selectByIndex(data);
			}
            
            else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			}
       
		
		}
		
		public static void mouseActions(WebElement element,String type) {               //8------------actionsmouse
			Actions a = new Actions(driver);
			if (type.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			}
			else if (type.equalsIgnoreCase("contextclick")) {
				a.contextClick(element).build().perform();
			}
			else if (type.equalsIgnoreCase("doubleclick")) {
                a.doubleClick(element).build().perform();				
			}
			else if (type.equalsIgnoreCase("dragdrop")) {
				a.clickAndHold(element).moveToElement(element).build().perform();
			}
		}
		   
		
		 public static void robot(String type) throws AWTException {                  //9------------robotkeyboard
				Robot r = new Robot();
				if (type.equalsIgnoreCase("down")) {
					r.keyPress(KeyEvent.VK_PAGE_DOWN);
					r.keyRelease(KeyEvent.VK_PAGE_DOWN);
				}
				else if (type.equalsIgnoreCase("enter")) {
				     r.keyPress(KeyEvent.VK_ENTER);
				     r.keyRelease(KeyEvent.VK_ENTER);
				}
				else if (type.equalsIgnoreCase("up")) {
					r.keyPress(KeyEvent.VK_PAGE_UP);
					r.keyRelease(KeyEvent.VK_PAGE_UP);
				}
			}
		 
		 
        public static  void alert(String type,String value) {                       //10------------alerts
        		Alert a = driver.switchTo().alert();
        		if (type.equalsIgnoreCase("accept")) {
					a.accept();
				}
        		else if (type.equalsIgnoreCase("dismiss")) {
					a.dismiss();
				}
        		else if (type.equalsIgnoreCase("sendkeys")) {
					a.sendKeys(value);
				}
        		else if (type.equalsIgnoreCase("gettext")) {
					String text = a.getText();
					System.out.println(text);
				}
						}
		
        
	    public static void getCurrentUrl() {                                     //11-------------
		     String currentUrl = driver.getCurrentUrl();
			 System.out.println(currentUrl);
            
		}
		
        public static void getTitle() {                                        //12-----------------
             String title = driver.getTitle();
             System.out.println(title);
		
        }
		  
        
       
		 
	    public static void navigateTo(String url) {                           //13-----------------
		      driver.navigate().to(url);

		} 
	    
	    public static void getText(WebElement element) {                     //14-----------------------
			String text = element.getText();
             System.out.println(text);
             
		}
	    
	    public static void getAttribute(WebElement element,String input) {    //15---------------------
			String attribute = element.getAttribute("input");
            System.out.println(attribute);
		}
	    
	    
	    
	    
	    public static  void navigateBack() {                                   //16----------------
			   driver.navigate().back();

		}
	    public static void navigateForward() {                                //17-------------------
			driver.navigate().forward();

		}
	    
	    public static void navigateRefresh() {                                //18------------------
			driver.navigate().refresh();

		}
	    
	    
	    public static void implicitWait() {                                           //19----------impli
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);

		}
	    
	     public static void explicitWait(WebElement element ) {                         //---------explici
			
             WebDriverWait wait = new WebDriverWait(driver,30);
             wait.until(ExpectedConditions.visibilityOf(element));
		}
	    
	    public static void threadSleep() throws InterruptedException {                //-------------thread.sleep
			Thread.sleep(5000);

		}
	    
	    
	    public static  void screenShot(String refname ) throws IOException {            //20---------screenshot

	     	TakesScreenshot ts = (TakesScreenshot) driver;
	     	
	     	File source = ts.getScreenshotAs(OutputType.FILE);
	     	
	     	File destination = new File(refname);
	     	
	     	FileUtils.copyFile(source, destination);
	     	

		}
	    
         public static void isDisplayed(WebElement element) {                        //21-----------------
             boolean displayed = element.isDisplayed();
			 System.out.println(displayed);

			}

	    
	     public static void isEnabled(WebElement element) {                          //22------------
			  boolean enabled = element.isEnabled();
			  System.out.println(enabled);
			}
	    
	     public static void isSelected(WebElement element) {                         //23---------------
			  boolean selected = element.isSelected();
              System.out.println(selected);
			}
	    
	     
	     
	     public static void isMultiple(WebElement element) {                         //24------------------
			Select s = new Select(element);
			 boolean multiple = s.isMultiple();
             System.out.println(multiple);
		}
	     
	     
	     
	     public static void getWindowHandle() {                                   //25---------------------
			String id = driver.getWindowHandle();
            System.out.println(id);
		}
	     
	     
	     
	     
	     public static void getWindowHandles() {                                  //26------------------
			Set<String> allid = driver.getWindowHandles();
             for (String printall : allid) {
				String s = driver.switchTo().window(printall).getTitle();
				System.out.println(s);
			}
		}
	     
	     public static void firstSelectedOption(WebElement element) {             //27firstselectedoption----
	    	 Select s = new Select(element);
	    	      WebElement firstSelectedOption = s.getFirstSelectedOption();
			      String text = firstSelectedOption.getText();
                  System.out.println(text);
		}
	     public static void getAllSelectedOptions(WebElement element) {            //28allselectedoptions----
			 Select s = new Select(element);
			 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
                 for (WebElement alloptions : allSelectedOptions) {
					System.out.println(alloptions.getText());
				}   
		}
	           public static void getOptions(WebElement element) {                 //29getoptions-----------
				Select s = new Select(element);
				List<WebElement> options = s.getOptions();
                 for (WebElement getoptions : options) {
					System.out.println(getoptions.getText());
				}
			}
	
	    public static void frames(WebElement element,String type){                //28---------------
	    	if (type.equalsIgnoreCase("frame")) {
	    		driver.switchTo().frame(element);	
			} 
	    	else if (type.equalsIgnoreCase("default")) {
				driver.switchTo().defaultContent();
			}	

		}		
		
	     public static void checkBoxClick(WebElement element) {                   //29------------------
			element.click();

		}

	     
	     public static void radioBox(WebElement element) {                        //30---------------------
			element.click();

	}
	     
	  
	     public static void  clearTextBox(WebElement element) {                   //31-----clear
			element.clear();

		}
	     
	     
	     public static void javaScript(WebElement element,String type) {
			 JavascriptExecutor jse = (JavascriptExecutor) driver;
			 if (type.equalsIgnoreCase("scrollup")) {
				jse.executeScript("window.scrollBy(0,1000)");
			 }
				else if (type.equalsIgnoreCase("scrolldown")) {
			    jse.executeScript("window.scrollBy(0,-1000)");
				
			}
				else if (type.equalsIgnoreCase("startingpage")) {
					jse.executeScript("window.scrollBy(0,0)","");
				}
				else if (type.equalsIgnoreCase("specificelement")) {
					jse.executeScript("arguments[0].scrollIntoView9true)",element);
				}
				else if (type.equalsIgnoreCase("click")) {
					jse.executeScript("arguments[0].click()", element);
				}
			}
             
}
	/*     public static String readParticularData(String path,int row_index,int cell_index) throws IOException {
			
	    	 File f = new File(path);
	    	 FileInputStream fis = new FileInputStream(f);
	    	 Workbook wb = new XSSFWorkbook(fis);
	    	 Sheet sheetAt = wb.getSheetAt(0);
	    	 Row row = sheetAt.getRow(row_index);
	    	 Cell cell = row.getCell(cell_index);
	    	 CellType cellType = cell.getCellType();
	    	 if (cellType.equals(CellType.STRING)) {
				 value = cell.getStringCellValue();
			}
	    	 else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int data = (int) numericCellValue;
				 value = String.valueOf(data);
			}
	    	 
	    	 
	    	 return value;
		}
	     
		}
	     
	     */
	     
	     			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


