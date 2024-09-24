package amazonflights_test;
//Test6-Validate search result for different classes(economy, business, first class)
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import amazonflights_source.Flights_Homepage;
import amazonflights_source.Flights_Loginpage;
import utility_flights.DDT_Air;
@Listeners(utility_flights.Listener2.class)

public class Test6_SearchResultforDifferentClasses extends Launch_Quit2{
	@Test(retryAnalyzer=utility_flights.RetryLogic.class)
	public void validating_SearchResultforDifferentClasses() throws EncryptedDocumentException, IOException, InterruptedException
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
	    h.click_searchbutton();
	    Thread.sleep(3000); 
	    
	    h.traveller_cabinselection();
	    Thread.sleep(2000);
	    h.adultpax_travellers();
	    Thread.sleep(2000);
	    h.premiumeconomy_select();
        Assert.assertEquals(h.preeconomyclass().isEnabled(), true, "Premium economy is not enabled");
	    h.click_searchbutton();
	    Thread.sleep(3000);
	    
	    h.traveller_cabinselection();
	    Thread.sleep(2000);
	    h.adultpax_travellers();
	    Thread.sleep(2000);
	    h.economy_select();
        Assert.assertEquals(h.economyclass().isEnabled(), true, "Economy is not enabled");
	    h.click_searchbutton();
	    Thread.sleep(3000);
	    
	    h.traveller_cabinselection();
	    Thread.sleep(2000);
	    h.adultpax_travellers();
	    Thread.sleep(2000);
	    h.business_select();
	    Assert.assertEquals(h.businessclass().isEnabled(), true, "Business is not enabled");
	    h.click_searchbutton();
	    Thread.sleep(3000);
	}

}
