package amazonflights_test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Test14- Check if user is able to search the domestic round-trip flights
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazonflights_source.Flights_Homepage;
import amazonflights_source.Flights_Loginpage;
import utility_flights.DDT_Air;
@Listeners(utility_flights.Listener2.class)

public class Test14_DomesticRoundTripFlight extends Launch_Quit2{
	@Test
	public void searching_domesticRoundTripFlight() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DDT_Air d=new DDT_Air();
		d.getDataFromExcelSheet("triplogin", 0, 0);
	
	Flights_Loginpage l1=new Flights_Loginpage(driver);
	l1.enter_username();
	l1.cont();
	l1.enter_password();
	l1.signin();
	
    Flights_Homepage h=new Flights_Homepage(driver);
    h.roundtrip_rbtn();
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
    h.returndateselection();
    Thread.sleep(2000);
 //   h.traveller_cabinselection();
  //  Thread.sleep(2000);
  //  h.adultpax_travellers();
  //  Thread.sleep(2000);
    h.click_searchbutton();
    Thread.sleep(3000);
	}
}
