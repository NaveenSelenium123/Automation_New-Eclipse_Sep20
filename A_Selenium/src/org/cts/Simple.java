package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {
	public static void main(String[] args) throws InterruptedException {
		String expectedDay = "1";
		String expectedMonthYear = "November 2022";
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open url
		driver.get("https://www.abhibus.com/");
		// find date picker webelement to perform click action
Thread.sleep(4000);
		WebElement datepicker = driver.findElement(By.id("datepicker1"));
		datepicker.click();
		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
	}
}
