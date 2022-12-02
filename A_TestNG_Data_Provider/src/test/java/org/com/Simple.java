package org.com;
//Not working
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {
	WebDriver driver;
	@BeforeClass
	public void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");	
}
@Parameters({"user","pass"})
@Test
public void login(String user,String pass) {
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("login")).click();

}
@Parameters({"Location","Hotel","Room","NoRoom","Adult","Children"})
@Test
public void selectHotel(int Location,int Hotel,int Room,int NoRoom,int Adult,int Children ) {
	WebElement ddnLocation = driver.findElement(By.id("location"));
	WebElement ddnHotel = driver.findElement(By.id("hotels"));
	WebElement ddnRoom = driver.findElement(By.id("room_type"));
	WebElement ddnNoofRoom = driver.findElement(By.id("room_nos"));
	WebElement ddnAdult = driver.findElement(By.id("adult_room"));
	WebElement ddnChildern = driver.findElement(By.id("child_room"));
	dropDownStat(ddnLocation,Location);
	dropDownStat(ddnHotel,Hotel);
	dropDownStat(ddnRoom,Room);
	dropDownStat(ddnNoofRoom,NoRoom);
	dropDownStat(ddnAdult,Adult);
	dropDownStat(ddnChildern,Children);
	driver.findElement(By.id("Submit")).click();
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();

}
@Parameters({"name","last_name","address","cc_num","cc_cvv","ccType","expMonth","expYear"})
@Test
public void bookAHotel(String n,String last_name,String address,String cc_num,String cc_cvv,int ccType,int expMonth,int  expYear ) throws InterruptedException {
	
	driver.findElement(By.id("first_name")).sendKeys(n);
	driver.findElement(By.id("last_name")).sendKeys(last_name);
	driver.findElement(By.id("address")).sendKeys(address);
	driver.findElement(By.id("cc_num")).sendKeys(cc_num);
	driver.findElement(By.id("cc_cvv")).sendKeys( cc_cvv);
	WebElement cc = driver.findElement(By.id("cc_type"));
	WebElement exp= driver.findElement(By.id("cc_exp_month"));
	WebElement expY = driver.findElement(By.id("cc_exp_year"));
	dropDownStat(cc,ccType);
	dropDownStat(exp,expMonth);
	dropDownStat(expY,expYear);
	driver.findElement(By.id("book_now")).click();
Thread.sleep(10000);
	WebElement txtOrder = driver.findElement(By.id("order_no"));
	String text = txtOrder.getAttribute("value");
	System.out.println(text);
}


public static void dropDownStat(WebElement element,int value) {
	Select s =new Select(element);
	s.selectByIndex(value);
	}
public static void click(WebElement element) {
	element.click();
}
}
