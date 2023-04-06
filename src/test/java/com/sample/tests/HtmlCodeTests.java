package com.sample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sample.pages.CssPage;
import com.sample.pages.HtmlPage;

public class HtmlCodeTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.html-code-generator.com/html/");
		
		HtmlPage htmlPageObj=new HtmlPage(driver);
		CssPage cssPageObj=new CssPage(driver);
		
		htmlPageObj.clickHtmlLink();
		htmlPageObj.getHeading();
		
		cssPageObj.clickHtmlLink();
		cssPageObj.getHeading();
		
		
		
		
	}

}
