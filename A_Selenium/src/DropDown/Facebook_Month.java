package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// To select the particular month
public class Facebook_Month {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\A_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreate .click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			String attribute = x.getAttribute("value");
			if(attribute.equals("1") || attribute.equals("11")) {
				System.out.println(x.getText());
				Thread.sleep(3000);
				x.click();
			}
		}
		
		}
}
