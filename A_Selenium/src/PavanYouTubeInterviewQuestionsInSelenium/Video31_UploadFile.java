package PavanYouTubeInterviewQuestionsInSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video31_UploadFile {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("(//a[@title='Click to upload your resume'])[1]")).click();
		//driver.findElement(By.id("file-upload")).sendKeys("D:\\Naveen_Resume.pdf");

		
		//Approach -2 using robot class
		WebElement button = driver.findElement(By.id("file-upload"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",button);
Robot rb=new Robot();
rb.delay(2000);
//StringSelection ss=new StringSelection("D:\\Naveen_Resume.pdf");
StringSelection ss=new StringSelection("D:\\JavaFileOper\\Train_ticket.pdf");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
rb.delay(2000);
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);
	
rb.delay(2000);	
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);	
rb.delay(2000);	
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);
	}
}