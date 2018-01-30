package com.org.vytla;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;

public class TestDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
WebDriver driver=new FirefoxDriver();
 driver.get("https://www.wikipedia.org/");
//driver.findElement(By.xpath(".//*[@id='searchLanguage']")).sendKeys("Dansk");
 Select select= new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
 //select.selectByVisibleText("Dansk");
select.selectByValue("hi");
/*
List<WebElement> options=select.getOptions();
	
for(int i=0;i<options.size();i++){
	System.out.println(options.get(i).getText());
}
System.out.println();

*/
/*

List<WebElement> options= (List<WebElement>) driver.findElement(By.tagName("option"));
for(int i=0;i<options.size();i++){
	System.out.println(options.get(i).getAttribute("lang"));
}
*/
System.out.println("print all Links");
WebElement block = driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]"));

List<WebElement> links=  (List<WebElement>) driver.findElements(By.tagName("a"));
for(int i=0;i<links.size();i++){
	System.out.println(links.get(i).getAttribute("href"));
}
	}

}
