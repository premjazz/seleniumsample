package com.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CssPage {
	
	
	WebDriver driver;
	
	public CssPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='CSS']")
	WebElement htmlLink;
	

	@FindBy(xpath="//h1")
	WebElement htmlHeading;
	
	public void clickHtmlLink() {
		htmlLink.click();
	}
	
	public void getHeading() {
		String val=htmlHeading.getText();
		System.out.println(val);
	}


}
