package com.testng.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testng.basepack.BaseClass;

public class AmazonHome extends BaseClass{
public AmazonHome() {
	PageFactory.initElements(driver, this);
}

@FindBy (xpath = "//input[@type='text']")
public WebElement clickAmzSearchBar;
}


