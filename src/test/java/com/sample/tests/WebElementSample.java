package com.sample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://stackoverflow.com/questions/75680149/unable-to-establish-websocket-connection");
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("testing");
		
		String textbox_val=driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(textbox_val);
		
		
		//driver.findElement(By.linkText("About")).click();
		
		
		String heading=driver.findElement(By.xpath("//a[@class='question-hyperlink']")).getText();
		System.out.println(heading);
		
		boolean element_displayed=driver.findElement(By.xpath("//a[@class='question-hyperlink']")).isDisplayed();
		System.out.println(element_displayed);
		
		WebElement xx=driver.findElement(By.linkText("About"));
			xx.click();
			
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.navigate().to("https://www.google.com/");
			
		
		/*
		 * textbox
		 * textarea
		 * file
		 * radio button
		 * dropdown
		 * link
		 * password
		 * text
		 * 
		 * 
		 * 
		 */
		
		
		
	}

}
