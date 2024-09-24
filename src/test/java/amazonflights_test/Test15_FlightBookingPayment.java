package amazonflights_test;
//Test15-Reach till payments page and select credit card option->entr card option->make the payment
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amazonflights_source.Flight_Detailspage;
import amazonflights_source.Flight_SeatSelectionpage;
import amazonflights_source.Flight_TravellersDetails;
import amazonflights_source.Flights_Homepage;
import amazonflights_source.Flights_Loginpage;
import amazonflights_source.Flights_ReviewBooking;
import amazonflights_source.Flights_SearchResultpage;
import amazonflights_source.Flights_paymentmethod;
import utility_flights.DDT_Air;

public class Test15_FlightBookingPayment extends Launch_Quit2{
	
	@Test
	public void payment_flightbooking() throws EncryptedDocumentException, IOException, InterruptedException
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
	 //   h.traveller_cabinselection();
	  //  Thread.sleep(2000);
	  //  h.adultpax_travellers();
	  //  Thread.sleep(2000);
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
	    fd.addfirstname("multiple_pax", 6, 0);
	    Thread.sleep(2000);
	    fd.addlastname("multiple_pax", 6, 1);
	    Thread.sleep(2000);
	    fd.click_addadult();
	    Thread.sleep(2000);  
	    
	    fd.click_proceed_seatselection();
	    Thread.sleep(2000);
	    
	    Flight_SeatSelectionpage fs=new Flight_SeatSelectionpage(driver);
	    fs.click_nextbutton();
	    Thread.sleep(2000);
	    fs.proceed_withoutseatselection();
	    Thread.sleep(2000);
	    
	    Flights_ReviewBooking rb=new Flights_ReviewBooking(driver);
	    rb.click_termscondition_chk();
	    Thread.sleep(2000);
	    rb.click_proceed_topayment();
	    
	    Thread.sleep(2000);
	    Flights_paymentmethod pm=new Flights_paymentmethod(driver);
	    pm.select_creditcard();
	    Thread.sleep(2000);
	    pm.enter_nickname();
	    Thread.sleep(2000);
	    pm.creditcardnumber();
	    Thread.sleep(2000);
	    pm.select_expirymonth();
	    Thread.sleep(2000);
	    pm.select_expiry_mnth4();
	    Thread.sleep(2000);
	    pm.select_expiryyear();
	    Thread.sleep(2000);
	    pm.select_expiry_year26();
	    Thread.sleep(2000);
	    pm.enter_card_details();
	}

}
