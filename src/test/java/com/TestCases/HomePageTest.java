package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.makeMyTrip.base.Base;
import com.makeMyTrip.base.Data;

public class HomePageTest extends Base {

	@BeforeTest()
	public void beforehomePage() {
		Base.setUP(Data.browser_c, Data.url, Data.time);
	}

	@Test
	public void homePage() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("MakeMyTrip - #1 Travel Website"));
	}

	@AfterTest()
	public void afterHomePageTest() {
		driver.close();
	}

}
