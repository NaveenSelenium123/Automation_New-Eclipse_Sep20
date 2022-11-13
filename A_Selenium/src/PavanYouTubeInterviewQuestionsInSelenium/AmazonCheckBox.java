package PavanYouTubeInterviewQuestionsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCheckBox {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\\\Windows_Old Eclipse Projects\\\\A_Selenium\\\\driver\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop i3 renewed" +Keys.ENTER);
		List<WebElement> checkbox = driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
		System.out.println("Total no of checkbox" +checkbox.size());
		Thread.sleep(3000);
		for (WebElement b : checkbox) {
			b.click();
		}

	}

}
