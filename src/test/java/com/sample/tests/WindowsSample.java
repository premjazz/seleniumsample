package com.sample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		
		String parent=driver.getWindowHandle();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		for(String chid:driver.getWindowHandles()) {
			driver.switchTo().window(chid);
		}
		
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);

		driver.close();
		
		driver.switchTo().window(parent);
		
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		driver.quit();
		
	}

}
