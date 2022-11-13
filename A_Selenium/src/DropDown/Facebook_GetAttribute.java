package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_GetAttribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\A_Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("Naveen");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("Naveen123");
	getAttribute(txtPass);
	driver.close();
}
public static String getAttribute(WebElement element) {
	String text = element.getAttribute("value");
	System.out.println("The text in Text Box  " +text);
	return text;
}

}
