package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Latest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	Thread.sleep(3000);
	WebElement lang= driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
	lang.click();
	Thread.sleep(3000);
	WebElement lang1 = driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[1]"));
	Select s =new Select(lang1);
	s.selectByIndex(3);
	
	
	WebElement country1 = driver.findElement(By.id("countries"));
	
	Select s1 =new Select(country1);
	s1.selectByIndex(0);
	boolean enabled = country1.isEnabled();
	System.out.println(enabled);
	
	/*WebElement country = driver.findElement(By.xpath("//span[@id='select2-country-container']"));
	System.out.println(country.isEnabled());
	Select s =new Select(country);
	s.selectByIndex(4);*/
	
}
}
