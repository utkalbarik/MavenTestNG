package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.browser.Driver;
import com.pages.HomePage;
import com.pages.LoginPage;

public class HomePageTests {
	
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void setUp() {
		Driver.initialize();
	}
	
	@AfterMethod
	public void wrapUp() {
		Driver.driver.close();
	}

	

	@Test
	public void test3() {
		homepage=new HomePage();
		homepage.searchOnGoogle();
		Assert.assertEquals(1, 1);
	}
}
