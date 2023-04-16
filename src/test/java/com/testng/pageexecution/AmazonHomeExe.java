package com.testng.pageexecution;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testng.basepack.BaseClass;
import com.testng.pagefactory.AmazonHome;


public class AmazonHomeExe {
 @BeforeTest
 public void browserLaunch() {
		BaseClass.launch();
	}
	
	@AfterTest
	public void browserClose() {
		BaseClass.browserClose();
	}
	
	@Test
	public void clickAndSearchTheIphone() throws IOException, AWTException {
		BaseClass.urlLoad(BaseClass.getProp("amazonUrl"));
		AmazonHome ddr = new AmazonHome();
		ddr.clickAmzSearchBar.sendKeys("Iphone");
		BaseClass.enterKey();
		System.out.println("Iphone search - executed");
	}
	
	@Test
	public void clickAndSearchTheSonyTv() throws IOException, AWTException {
		BaseClass.urlLoad(BaseClass.getProp("amazonUrl"));
		AmazonHome ddr = new AmazonHome();
		ddr.clickAmzSearchBar.sendKeys("Sony Tv");
		BaseClass.enterKey();
		System.out.println("Sony Tv search - executed");
	}
	
	@Test
	public void clickAndSearchTheDslr() throws IOException, AWTException {
		BaseClass.urlLoad(BaseClass.getProp("amazonUrl"));
		AmazonHome ddr = new AmazonHome();
		ddr.clickAmzSearchBar.sendKeys("Dslr camera");
		BaseClass.enterKey();
		System.out.println("Dslr camera search - executed");
	}
}
