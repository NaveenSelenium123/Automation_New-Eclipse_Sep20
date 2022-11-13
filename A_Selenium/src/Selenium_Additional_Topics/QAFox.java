package Selenium_Additional_Topics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
public class QAFox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\A_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Capabilities cap=((RemoteWebDriver)driver).getCapabilities();
System.out.println(cap.getBrowserName());
System.out.println(cap.getBrowserVersion());
		
	}
}
