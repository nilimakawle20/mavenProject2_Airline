package amazonflights_test;
//Test2-Validate the login functionality with valid credentials
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazonflights_source.Flights_Loginpage;
import utility_flights.DDT_Air;

@Listeners(utility_flights.Listener2.class)
public class Test2_LoginAmazonFlights extends Launch_Quit2{
	@Test(retryAnalyzer=utility_flights.RetryLogic.class)
	public void flightLogin() throws EncryptedDocumentException, IOException
	{
		
		DDT_Air d=new DDT_Air();
		d.getDataFromExcelSheet("triplogin", 0, 0);
		
		Flights_Loginpage l1=new Flights_Loginpage(driver);
		l1.enter_username();
		l1.cont();
		l1.enter_password();
		l1.signin();
		
	    Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon", "Sorry, title is not matching");
	}

}
