package task6greensjunitworking;   // for adactin pom framework6     (1-2-3-4-5)[total ]
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import junitgreenstask8.BaseClassPom;
public class AdactinPOM extends BaseClassPom   {
	@BeforeClass
	public static  void beforeclass() {
		browserConChrome();
		openApplication("https://adactinhotelapp.com/");
		maximizeWindow();	
	}
	@Test
	public  void tc1() throws IOException {
		LoginAdactinPOM1 a=new LoginAdactinPOM1();
		inputText(a.getTxtUserName(),"NAVEENREDMINOTE10");
		inputText(a.getTxtPassword(),"Adactin@123");
		click(a.getTxtLogin());	
		SearchHotel2 b =new SearchHotel2();
		dropdown(b.getLocation(),5);
		dropdown(b.getHotels(),2);
		dropdown(b.getRoomType(),3);
		dropdown(b.getNumberOfRooms(),1);
		dropdown(b.getAdultPerRoom(),3);
		dropdown(b.getChildrenPerRoom(),2);
		click(b.getSearch());
		SelectHotel3 c =new SelectHotel3();
		click(c.getSelect());
		click(c.getContinue1());
		bookAHotel4 d =new bookAHotel4();
		inputText(d.getFirstName(),"NAVEEN");
		inputText(d.getLastName(),"KUMAR");
		inputText(d.getBillingAddress(),"16 east street,chennai-600044");
		inputText(d.getCreditCardNo(),"1234567890123456");
		dropdown(d.getCreditCardType(),2);
		dropdown(d.getExpyMonth(),2);
		dropdown(d.getExpyYear(),12);
		inputText(d.getCvvNo(),"123");
		click(d.getBookNow());
		//BookingConfirmation5 e =new BookingConfirmation5();
		// getAttribute(e.getBookingConfirm());



	}
	}	


