package amazonflights_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights_ReviewBooking {
    WebDriver driver;
	
	@FindBy(xpath="//div[@class='c172d511']/label/i")                         
	WebElement termscondition_chk;
	
	@FindBy(xpath="//button[.='Proceed to Payment']")                       
	WebElement proceed_topayment;
	
	public void click_termscondition_chk()                
	{
		termscondition_chk.click();
	}
	
	public void click_proceed_topayment()                        
	{
		proceed_topayment.click(); 
	}
	
	public Flights_ReviewBooking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
