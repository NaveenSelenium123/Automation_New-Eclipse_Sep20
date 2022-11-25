package org.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExe4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\A_Selenium_LatestWorking_Nov08\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
	Thread.sleep(3000);
	
WebElement txtUsername = driver.findElement(By.id("DUMMY1"));
txtUsername.click();
//	txtUsername.sendKeys("Navee898989n"+Keys.ENTER);
//	
//	Alert a=driver.switchTo().alert();	a.accept();
//	driver.switchTo().frame(0);
//	Thread.sleep(3000);
//	WebElement btnArrow = driver.findElement(By.xpath("//*[@id=\"user-id-goahead\"]"));
//	//btnArrow.click();
//	JavascriptExecutor js =(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click",btnArrow );
//	Thread.sleep(3000);
	
	//WebElement btnArrow = driver.findElement(By.id("user-id-goahead"));
	//btnArrow.click(); 
	//WebElement   btnArrow= driver.findElement(By.xpath("(//img[@class='goahead'])[1]"));
	//JavascriptExecutor js =(JavascriptExecutor) driver;
    //js.executeScript("arguments[0].click()",btnArrow );
	
	
	WebElement btnUsername = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	btnUsername.sendKeys("Naveen");
	WebElement txtPassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	txtPassword.sendKeys("123456780");
	
}
}
