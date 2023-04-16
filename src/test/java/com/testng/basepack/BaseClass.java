package com.testng.basepack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void urlLoad(String url) {
		driver.get(url);
	}
	public static  String getCurUrl() {
		return driver.getCurrentUrl();
	}
	public static WebElement searchElementById(String id) {
		return driver.findElement(By.id(id));
	}
	public static WebElement searchElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	public static WebElement searchElementByName(String name) {
		return driver.findElement(By.name(name));
	}
	//Robot class
	public static void enterKey() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static String getProp(String pf) throws IOException {
		File fl = new File("C:\\Users\\Muhamed Javeed\\Project-class-Eclipse-workspace\\"
				+ "NewTestNGProject\\src\\test\\resources\\cred.properties");
		FileInputStream fis = new FileInputStream(fl);
		Properties prp = new Properties();
		prp.load(fis);
		return prp.getProperty(pf);
	}
	public static void browserClose() {
		driver.close();
	}
}
