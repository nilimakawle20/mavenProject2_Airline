package amazonflights_test;
//Test3-Test login with invalid credentials and ensure proper error message are displayed
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazonflights_source.Flights_Loginpage;
import utility_flights.DDT_Air;

@Listeners(utility_flights.Listener2.class)
public class Test3_Login_WithInvalidDetails extends Launch_Quit2{
@Test(retryAnalyzer=utility_flights.RetryLogic.class)
public void failedlogin() throws EncryptedDocumentException, IOException
{
	DDT_Air d=new DDT_Air();
	d.getDataFromExcelSheet("triplogin", 1, 0);
	
	Flights_Loginpage l1=new Flights_Loginpage(driver);
	l1.enter_username();
	l1.cont();
	l1.enter_password();
	l1.signin();
	
  }
}
