package DropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// To print alternative option and Reverse selection
public class Facebook {
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
		for(int i=0;i<options.size();i++) {
			if(i%2==1) {
				System.out.println(options.get(i).getText());
			}
		}
		for(int i =options.size()-1;i>0;i--) {
			if(i%2==1) {
			Thread.sleep(3000);
				options.get(i).click();
			}
		}
	
	}
	}

