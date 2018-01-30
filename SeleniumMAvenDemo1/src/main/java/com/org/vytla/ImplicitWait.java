package com.org.vytla;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//Insted of sleep we can use this
		// it will applicable 10 sec to all driver statements 
		driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);

		driver.navigate().to("http://gmail.com");
		String actual_Title = driver.getTitle();
		driver.manage().window().maximize();

	}

}
