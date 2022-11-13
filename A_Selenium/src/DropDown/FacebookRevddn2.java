package DropDown;
// To select the particular day in dropdown
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRevddn2 {

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
		System.out.println(options.size());
		
		for (WebElement Day : options) {
			String attribute = Day.getAttribute("value");
if( attribute.equals("1") || attribute.equals("23")) {
	Thread.sleep(3000);
	Day.click();
	System.out.println(Day.getText());
}
		}
	}

}
