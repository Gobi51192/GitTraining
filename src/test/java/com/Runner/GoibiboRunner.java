package com.Runner;

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
	

}
