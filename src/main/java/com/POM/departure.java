package com.POM;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;



public class departure extends BaseClass {
	 WebDriver driver;
		
		public departure(WebDriver driver) {
			this.driver = driver;
			
			PageFactory.initElements(driver,this);
		}
	
	
	
	@FindBy(xpath="//span[@class='logSprite icClose']")
	private WebElement close;
	
	@FindBy(xpath="//span[@class='sc-12foipm-21 lerOcM fswDownArrow']")
	private WebElement departure;
	
	@FindBy(xpath="//div[@aria-label='Sun Jun 04 2023']")
	private WebElement date;
	
	@FindBy(xpath="//span[text()='Done']")
	private WebElement done;
	
	@FindBy(xpath="//p[text()='Sunday']")
	private WebElement sunday;
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancel;
	@FindBy(xpath = "(//span[@class='sc-12foipm-17 fZDXDJ fswWidgetLabel'])[5]")
	private WebElement adulttab;
	
	
	@FindBy(xpath ="//span[@role='presentation']")
	private WebElement wrongbutton;
	
	@FindBy(xpath ="(//span[@class='sc-12foipm-63 ePVCFi'])[2]")
	private WebElement plusbutton;
	
	@FindBy(xpath = "//a[text()='Done']")
	private WebElement doneb;

	public WebElement getDoneb() {
		return doneb;
	}


	public WebElement getPlusbutton() {
		return plusbutton;
	}


	public WebElement getAdulttab() {
		return adulttab;
	}


	public WebElement getWrongbutton() {
		return wrongbutton;
	}

	
	public WebElement getCancel() {
		return cancel;
	}

	@FindBy(xpath="//span[text()='Departure']")
	private WebElement departuredis;

	public WebElement getClose() {
		return close;
	}

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDone() {
		return done;
	}

	public WebElement getSunday() {
		return sunday;
	}

	public WebElement getDeparturedis() {
		return departuredis;
	}
	
	

}
