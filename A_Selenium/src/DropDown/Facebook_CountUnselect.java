package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_CountUnselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\A_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreate .click();
		Thread.sleep(3000);
		WebElement ddnDay = driver.findElement(By.id("day"));
		Select s=new Select(ddnDay);
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getOptions();
		int a= options.size();
		
s.selectByIndex(0);
s.selectByIndex(1);
s.selectByIndex(2);
s.selectByIndex(3);
s.selectByIndex(4);
s.selectByIndex(5);
Thread.sleep(3000);
		List<WebElement> allSelect = s.getAllSelectedOptions();
		int allS = allSelect.size();
		System.out.println(allS);
		System.out.println("The total options not selected in the dropdown"+" ");
		System.out.println( a-allS);
	}

}
