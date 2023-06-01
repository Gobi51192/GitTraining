package com.Runner;

import org.apache.hc.core5.reactor.Command.Priority;
import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.POM.POMSummer;

@Listeners(ListenerClass.class)
public class GoibiboRunner extends BaseClass {

	public POMSummer p;

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void ApplicationLaunch() throws InterruptedException {
		browserLaunch("Chrome");
		implicitWait(15);
		p = new POMSummer(driver);
		urlLaunch("https://www.goibibo.com/");
		clickOnElement(p.getFromPOM().getLoginSkip());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	private void orgin() {
		clickOnElement(p.getFromPOM().getFromCity());
		inputValues(p.getFromPOM().getFromCityInput(), "Chennai");
		Assert.assertTrue(p.getFromPOM().getChennai().isDisplayed());
		mouseClick(p.getFromPOM().getChennai());
	}
	
	
	
	@Test(priority =3)
	public void departuretab() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElement(p.getdeparture().getDeparture());
		clickOnElement(p.getdeparture().getDate());
		clickOnElement(p.getdeparture().getDone());
		Assert.assertTrue(p.getdeparture().getSunday().isDisplayed());
	}

	@Test(priority =4)
	public void adulttab() throws InterruptedException {
		if(p.getsearchPOM().getAdulttab().isDisplayed()) {
		clickOnElement(p.getsearchPOM().getAdulttab());
		Thread.sleep(2000);
		}
	}
	@Test(priority=5 )
	public void plusbutton() {
		for(int i=1;i<=3;i++) {
		mouseClick(p.getsearchPOM().getPlusbutton());
		}
	}
	@Test(priority =6)
	public void donebutton() throws InterruptedException {
		if(p.getsearchPOM().getDoneb().isDisplayed()) {
		clickOnElement(p.getsearchPOM().getDoneb());
		Thread.sleep(4000);
		}
	}

}
