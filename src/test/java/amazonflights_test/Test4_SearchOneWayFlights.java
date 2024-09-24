package amazonflights_test;
//Test4-Test the functionality for one-way flights
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import amazonflights_source.Flights_Homepage;
import amazonflights_source.Flights_Loginpage;
import utility_flights.DDT_Air;
@Listeners(utility_flights.Listener2.class)

public class Test4_SearchOneWayFlights extends Launch_Quit2{
	@Test(retryAnalyzer=utility_flights.RetryLogic.class)
	public void searching_oneway_flights() throws InterruptedException, EncryptedDocumentException, IOException
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
	}
}
