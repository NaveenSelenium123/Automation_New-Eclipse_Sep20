package pom_Framework;

public class Adactin extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserConChrome();
		openApplication("http://adactinhotelapp.com/");
		maximizeWindow();
		Login l =new Login();
		inputText(l.getTxtEmail(),"NaveenSelenium");
		inputText(l.getTxtPass(),"123456");
		//click(l.getBtnLogin());
		//Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		inputText(l.getTxtEmail(),"898989");
	
		
	}

}
