package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
	File f = new File
			("C:\\Users\\Change-This-Username\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\properties\\Configurationpropreties");

FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	
	p.load(fis);
	}
	
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;

	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}
	
	
	
	
	
}
