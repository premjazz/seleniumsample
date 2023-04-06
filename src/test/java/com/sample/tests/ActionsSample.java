package com.sample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/CSSref/tryit.php?filename=trycss_sel_hover");
		
		
		driver.switchTo().frame("iframeResult");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='w3schools.com']"))).click().build().perform();

	}

}
