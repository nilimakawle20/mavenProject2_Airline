package amazonflights_test;
//Test11-Validate if after clicking on book button in the search page user is able to enter evry text field present like pincode,state,radio button,firstname,lastname, email id, mobile number, promo code etc

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazonflights_source.Flight_Detailspage;
import amazonflights_source.Flight_TravellersDetails;
import amazonflights_source.Flights_Homepage;
import amazonflights_source.Flights_Loginpage;
import amazonflights_source.Flights_SearchResultpage;

import utility_flights.DDT_Air;
@Listeners(utility_flights.Listener2.class)

public class Test11_ValidateEveryTextField extends Launch_Quit2{
	@Test
	public void validating_evrytextfield() throws InterruptedException, EncryptedDocumentException, IOException
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
	
	    Assert.assertEquals(d1.discount_offer().isDisplayed(), true, "Discount not showing");
	    
	    Thread.sleep(2000);
	    d1.click_proceedtravellerdetails();
	    Thread.sleep(2000);
	    
	    Flight_TravellersDetails fd=new Flight_TravellersDetails(driver);
	    fd.click_addNewAdult();
	    Thread.sleep(2000);
	    
	    fd.click_gender_drpdown();
	    Thread.sleep(2000);
	    fd.genderDropFemale();
	    
	    Assert.assertEquals(fd.firstmiddlename().isEnabled(), true, "first name textfield not enabled"); 
	    Assert.assertEquals(fd.lastname1().isEnabled(), true, "last name textfield not enabled"); 
	    
	    Assert.assertEquals(fd.mobile_number().isEnabled(), true, "mobile number textfield not enabled"); 
	    Assert.assertEquals(fd.email_address().isEnabled(), true, "email id textfield not enabled"); 
	    
	}

}
