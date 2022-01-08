package org.pom;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.login.BaseClass;
import org.openqa.selenium.WebDriver;

public class PomExecution extends BaseClass {
static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
    chromeLaunch();
	getUrl("https://adactinhotelapp.com/index.php");
	maximize();
	}
	
	@Test
	public void booking() throws IOException, AWTException, InterruptedException {
		
		LoginPage loginpage = new LoginPage();
		loginpage.login();
		
		SearchHotel searchHotelPage = new SearchHotel();
		//searchHotelPage.verifySearchHotel();
		searchHotelPage.searchhotel(2, 1, 3, 1, 2, 3);
		
		SelectHotel selectHotelPage = new SelectHotel();
		//selectHotelPage.verifySelectHotel();
		selectHotelPage.selectHotel();
		
		BookHotelPage bookHotelPage = new BookHotelPage();
		//bookHotelPage.BookHotel();
		bookHotelPage.BookHotel();
		
		Thread.sleep(6000);
		
		BookingConformationPage bookingConfirmationPage = new BookingConformationPage();
		bookingConfirmationPage.BookingConformation();
		
		CancelPage cancelBookingPage = new CancelPage();
		cancelBookingPage.cancelBooking();
		cancelBookingPage.verifyBookingCancelled();

	}
}

