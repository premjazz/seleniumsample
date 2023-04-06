package com.sample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	//	driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.xpath("//h3")).click();
		
		

	}

}
