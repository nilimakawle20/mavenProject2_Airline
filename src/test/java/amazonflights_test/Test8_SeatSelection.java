package amazonflights_test;
//Test8-Check for seat selection during booking process
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazonflights_source.Flight_Detailspage;
import amazonflights_source.Flight_SeatSelectionpage;
import amazonflights_source.Flight_TravellersDetails;
import amazonflights_source.Flights_Homepage;
import amazonflights_source.Flights_Loginpage;
import amazonflights_source.Flights_SearchResultpage;
import utility_flights.DDT_Air;
@Listeners(utility_flights.Listener2.class)

public class Test8_SeatSelection extends Launch_Quit2{
	@Test(retryAnalyzer=utility_flights.RetryLogic.class)
	public void flightseatselection() throws EncryptedDocumentException, IOException, InterruptedException
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
	    //h.traveller_cabinselection();
	    //Thread.sleep(2000);
	    //h.adultpax_travellers();
	    //Thread.sleep(2000);
	    h.click_searchbutton();
	    Thread.sleep(3000);
	    
	    Flights_SearchResultpage s1=new Flights_SearchResultpage(driver);
	    s1.book_flight();
	    Thread.sleep(2000);
	    
	    Flight_Detailspage d1=new Flight_Detailspage(driver);
	    d1.click_proceedtravellerdetails();
	    Thread.sleep(2000);
	    
	    Flight_TravellersDetails fd=new Flight_TravellersDetails(driver);
	    fd.click_addNewAdult();
	    Thread.sleep(2000);
	    
	    fd.click_gender_drpdown();
	    Thread.sleep(2000);
	    fd.genderDropFemale();
	    fd.addfirstname("multiple_pax", 5, 0);
	    Thread.sleep(2000);
	    fd.addlastname("multiple_pax", 5, 1);
	    Thread.sleep(2000);
	    fd.click_addadult();
	    Thread.sleep(2000);
	    
	    fd.click_proceed_seatselection();
	    Thread.sleep(2000);
	    
	    Flight_SeatSelectionpage ss=new Flight_SeatSelectionpage(driver);
	    Assert.assertEquals(ss.heading_select_seat().isDisplayed(), true, "Heading Select Seat not displayed");
	    Thread.sleep(2000);  
	}
}
