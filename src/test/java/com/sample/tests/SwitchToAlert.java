package com.sample.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToAlert {
	
	
	public static void main(String[] args) {
		
		
			
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			
			
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			Alert xx=driver.switchTo().alert();
			String alertText=xx.getText();
			System.out.println("===>"+alertText);
			
			xx.accept();
			//xx.dismiss();
			//xx.sendKeys("testing");
			
			driver.switchTo().defaultContent();
		
		
	}
	

}
