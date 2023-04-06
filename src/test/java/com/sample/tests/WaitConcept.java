package com.sample.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * implicity wait - It is used to wait for entire page to get loaded
		 * Explicity wait - It is used to wait for particular component to get loaded
		 * Fluent wait - It is used to wait for particular component to get loaded polling time
		 */
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.html-code-generator.com/html/drop-down/state-name");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Select country=new Select(driver.findElement(By.id("user-country")));
		country.selectByVisibleText("Algeria");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement xx = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( "user-state")));
		
		Select state=new Select(driver.findElement(By.id("user-state")));
		state.selectByVisibleText("Alger");
		
		/*
		 * Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver) .withTimeout(30,
		 * TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class); WebElement clickseleniumlink =
		 * wait1.until(new Function<WebDriver, WebElement>(){
		 * 
		 * public WebElement apply(WebDriver driver ) { return
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"
		 * )); } });
		 */
		//click on the selenium link
		//clickseleniumlink.click();
	}

}
