package com.testng.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testng.basepack.BaseClass;

public class MeeshoHome extends BaseClass {
public MeeshoHome() {
	PageFactory.initElements(driver, this);
}
	@FindBy (xpath = "(//input[@type='text'])[1]")
	public WebElement clickSearchBar;
}
