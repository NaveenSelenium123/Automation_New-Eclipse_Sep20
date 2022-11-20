package org.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames");
	List<WebElement> iframeCount = driver.findElements(By.tagName("iframe"));
	System.out.println("iframe Counts" +iframeCount.size());
	driver.switchTo().frame("frame1");
	WebElement txt = driver.findElement(By.xpath("//body//input"));
	txt.sendKeys("A");
	driver.switchTo().frame(0);
	WebElement check = driver.findElement(By.id("a"));
	check.click();
	
	Thread.sleep(3000);
	driver.switchTo().parentFrame();
	
	WebElement txt1 = driver.findElement(By.xpath("//body//input"));
	txt1.sendKeys("hello");
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	
	WebElement ddn = driver.findElement(By.id("animals"));
	Select s =new Select(ddn);
	s.selectByIndex(2);
	
	
	System.out.println(s.isMultiple());
	
	System.out.println(driver.findElement(By.id("animals")).isEnabled());
}
}
