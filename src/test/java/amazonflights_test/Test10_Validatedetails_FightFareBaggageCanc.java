package amazonflights_test;
//Test10-Validate the flight information, fare details,baggage rules and cancellation rules link has the details in the search result page.
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonflights_source.Flight_Detailspage;
import amazonflights_source.Flights_Homepage;
import amazonflights_source.Flights_Loginpage;
import amazonflights_source.Flights_SearchResultpage;
import utility_flights.DDT_Air;

public class Test10_Validatedetails_FightFareBaggageCanc extends Launch_Quit2{
	@Test
	public void validating_various_details() throws InterruptedException, EncryptedDocumentException, IOException
	{
	DDT_Air d=new DDT_Air();
	d.getDataFromExcelSheet("triplogin", 0, 0);
	
	Flights_Loginpage l1=new Flights_Loginpage(driver);
	l1.enter_username();
	l1.cont();
	l1.enter_password();
	l1.signin();
	
    Flights_Homepage h=new Flights_Homepage(driver);
    h.oneway_rbtn();
    h.fromsectorclick();
    Thread.sleep(2000);
    h.select_fromto1();
    Thread.sleep(2000);
    h.selectfromairport_op1();
    Thread.sleep(2000);
 
    h.select_fromto2();
    Thread.sleep(2000);
    h.selecttoairport_op1();
    Thread.sleep(2000);
  
    h.departdateselection();
    Thread.sleep(2000);
   // h.traveller_cabinselection();
   // Thread.sleep(2000);
   // h.adultpax_travellers();
   // Thread.sleep(2000);
    h.click_searchbutton();
    Thread.sleep(3000);
    
    Flights_SearchResultpage s1=new Flights_SearchResultpage(driver);
    s1.book_flight();
    Thread.sleep(2000);
    	Flight_Detailspage d1=new Flight_Detailspage(driver);
    	d1.flightdetails().isDisplayed();
    	Assert.assertEquals(d1.flightdetails().isDisplayed(), true);
    	
    	Thread.sleep(2000);
    	d1.baggage_and_canc();
    	d1.baggagerules().isDisplayed();
    	Assert.assertEquals(d1.baggagerules().isDisplayed(), true);
    	
    	Thread.sleep(2000);
    	d1.cancellation_link();
    	d1.cancel_rules().isDisplayed();
    	Assert.assertEquals(d1.cancel_rules().isDisplayed(), true);
    	
    	Thread.sleep(2000);
    	d1.view_faredetails();
    	d1.total_amount().isDisplayed();
    	Assert.assertEquals(d1.total_amount().isDisplayed(), true);
	}	
}

