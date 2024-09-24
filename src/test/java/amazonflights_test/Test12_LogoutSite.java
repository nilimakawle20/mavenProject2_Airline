package amazonflights_test;
//Test12-Login to page, search the flight and logout
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazonflights_source.Flights_Homepage;
import amazonflights_source.Flights_Loginpage;
import utility_flights.DDT_Air;
@Listeners(utility_flights.Listener2.class)
public class Test12_LogoutSite extends Launch_Quit2{
	@Test
	public void logout_amazonflights() throws EncryptedDocumentException, IOException, InterruptedException
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
	  h.accountlist1(driver);
	  h.signout();
	  
	  Assert.assertEquals(driver.getTitle(), "Amazon Sign In", "Title is not matching");
	}

}
