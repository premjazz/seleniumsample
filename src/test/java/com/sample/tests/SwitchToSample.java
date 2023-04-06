package com.sample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToSample {
	
	
	public static void main(String[] args) {
		
		
			
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
			
			
			driver.switchTo().frame("iframeResult");
			
			
			String val=driver.findElement(By.xpath("//h1")).getText();
			System.out.println("the value is : "+val);
			
			driver.switchTo().defaultContent();
		
		
	}
	

}
