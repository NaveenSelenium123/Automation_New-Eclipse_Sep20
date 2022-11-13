package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a =new Actions(driver);
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest1= driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));	
	

a.dragAndDrop(src, dest).perform();
Thread.sleep(3000);
a.dragAndDrop(src1, dest1).perform();
	}
}