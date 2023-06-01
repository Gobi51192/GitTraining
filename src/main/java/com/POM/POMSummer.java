package com.POM;

import org.openqa.selenium.WebDriver;

public class POMSummer {
	public WebDriver driver;
	
	public POMSummer(WebDriver dri) {
		driver=dri;
	}
	private FromPOM fromPOM;
	
	private searchadult searchPOM;

	
	public FromPOM getFromPOM() {
		if(fromPOM==null) {
		fromPOM=new FromPOM(driver);
		}
		return fromPOM;
	}
	
	public searchadult getsearchPOM() {
		if(searchPOM==null) {
		searchPOM=new searchadult(driver);
		}
		return searchPOM;
	}
	
	
	
}
