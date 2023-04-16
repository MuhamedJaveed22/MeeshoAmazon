package com.testng.pageexecution;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testng.basepack.BaseClass;
import com.testng.pagefactory.MeeshoHome;

public class MeeshoHomeExe {
	
	@BeforeTest
	public void browserLaunch() {
		BaseClass.launch();
	}
	
	@AfterTest
	public void browserClose() {
		BaseClass.browserClose();
	}
	
@Test
public void clickAndSearchTheTshirt() throws IOException, AWTException{
	BaseClass.urlLoad(BaseClass.getProp("meeshoUrl"));
	MeeshoHome mh = new MeeshoHome();
	mh.clickSearchBar.sendKeys("Tshirt");
	BaseClass.enterKey();
	System.out.println("Tshirt search - executed");
}

@Test
public void clickAndSearchTheJeans() throws IOException, AWTException{
	BaseClass.urlLoad(BaseClass.getProp("meeshoUrl"));
	MeeshoHome mh = new MeeshoHome();
	mh.clickSearchBar.sendKeys("Jeans");
	BaseClass.enterKey();
	System.out.println("Jeans search - executed");
}

@Test
public void clickAndSearchTheKurti() throws IOException, AWTException{
	BaseClass.urlLoad(BaseClass.getProp("meeshoUrl"));
	MeeshoHome mh = new MeeshoHome();
	mh.clickSearchBar.sendKeys("Kurti");
	BaseClass.enterKey();
	System.out.println("Kurti search - executed");
}
}