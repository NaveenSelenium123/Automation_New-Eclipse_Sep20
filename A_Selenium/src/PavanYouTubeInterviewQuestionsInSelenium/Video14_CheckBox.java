package PavanYouTubeInterviewQuestionsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video14_CheckBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\\\\\\\Windows_Old Eclipse Projects\\\\\\\\A_Selenium\\\\\\\\driver\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
System.out.println("Total no of checkbox" +checkboxes.size());
//for (int i = 0; i < checkboxes.size(); i++) {
//	checkboxes.get(i).click();
//}
//for (WebElement chbox : checkboxes) {
//	chbox.click();
//}
	
	//For radio button
//List<WebElement> radioButton = driver.findElements(By.xpath("//div[@class='custom-control custom-radio']"));
//System.out.println("Total no of radioButton" +radioButton.size());
//for (WebElement radio : radioButton) {
//	radio.click();
//}
for(int j=0;j<=10;j++) {//  ----->This forloop for 10 times the checkbox clicking the below looping
	for (int i= checkboxes.size()-1;i>=0;i--) {
		Thread.sleep(1000);
		checkboxes.get(i).click();
	}
	
	// second website
//	driver.get("https://jqueryui.com/checkboxradio/");
//	Thread.sleep(3000);
//	driver.switchTo().frame(0);
//	List<WebElement> checkbox = driver.findElements(By.xpath("//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
//	for (WebElement chbx : checkbox) {
//		chbx.click();	
//	}
//	
//	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
//	driver.findElement(By.id("justAnInputBox")).click();
//	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//	for (WebElement ch : checkbox) {
//		ch.click();
//	}
}
}
}