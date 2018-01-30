package com.org.vytla;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.withMessage("Time after 30 sec user defined")
				.ignoring(NoSuchElementException.class);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sativytla@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("HAIIIII");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();	
		driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div")).getText();
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		
	
		
	}

}
