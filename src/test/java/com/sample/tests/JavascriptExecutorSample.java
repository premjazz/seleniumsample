package com.sample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptExecutorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		

		JavascriptExecutor js = (JavascriptExecutor) driver;  
		//js.executeScript("window.scrollBy(0,3000)");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("scenario-4-horizontal-scroll-on-the-web-page")));

	}

}
