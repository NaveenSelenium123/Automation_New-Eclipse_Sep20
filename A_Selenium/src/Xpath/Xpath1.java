package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\SeleniumPracticeDailyOct10\\\\driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
//driver.get("https://login.salesforce.com/?locale=in");
//	Thread.sleep(3000);
//	//driver.findElement(By.xpath("//a[contains(@id,'forgot')]")).click();
//	//driver.findElement(By.xpath("//a[contains(text(),'Forgot Y')]")).click();
////	driver.findElement(By.xpath("//a[starts-with(text(), 'Forgot Your Password?')]")).click();
//	//driver.findElement(By.xpath("//a[starts-with(text(), 'Forgo')]")).click();
//driver.findElement(By.xpath("//a[starts-with(text(), 'F')]")).click();
//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);
//driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][@name='username'] [@placeholder='Username']")).sendKeys("Greens");
//driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("Test");
//driver.findElement(By.xpath("//input[@type='password' and @id='password' and @ name='pw']")).sendKeys("Test");
//driver.findElement(By.xpath("//input[@type='password'] [@id='password'][@ name='pw']")).sendKeys("Test");
//driver.findElement(By.xpath("//input[@type='password' or @id='password' or name='pw']")).sendKeys("Test");
driver.get("https://www.zoho.com/crm/signup.html");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//div[@class='passWord labelIcon field-error']/self::div")).sendKeys("ZOHO");

//driver.findElement(By.xpath("(//input)[3]")).sendKeys("123456");
//List<WebElement> list = driver.findElements(By.xpath("//input"));
//for (WebElement l : list) {
//	if(l.getAttribute("name").equalsIgnoreCase("password")) {
//		l.sendKeys("Test");
//	}
//}
//list.get(2).sendKeys("Grrens");
driver.findElement(By.cssSelector("input[id='namefield']")).sendKeys("ZOHO");

}
}
