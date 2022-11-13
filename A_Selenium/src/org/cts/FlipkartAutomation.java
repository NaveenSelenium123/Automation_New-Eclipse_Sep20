package org.cts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FlipkartAutomation {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		WebElement mouseElectronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		//a.moveToElement(mouseElectronics).perform();
		Thread.sleep(3000);
		WebElement laptopAccesories = driver.findElement(By.xpath("//a[text()='Laptop Accessories']"));
		a.moveToElement(laptopAccesories).perform();
		Thread.sleep(3000);
		WebElement laptopKeyboards = driver.findElement(By.xpath("//a[text()='Laptop Keyboards']"));
	a.moveToElement(laptopKeyboards).perform();
	Thread.sleep(3000);
	WebElement mouseElectronics1 = driver.findElement(By.xpath("//div[text()='Electronics']"));
	a.moveToElement(mouseElectronics1).perform();
	Thread.sleep(3000);
	WebElement Game = driver.findElement(By.xpath("//a[text()='Gaming']"));
	a.moveToElement(Game).perform();
	Thread.sleep(3000);
	WebElement game1 = driver.findElement(By.xpath("//a[text()='Gaming Consoles']"));
	a.moveToElement( game1).perform();
	game1.click();

	}
}