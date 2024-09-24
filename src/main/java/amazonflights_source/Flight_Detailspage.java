package amazonflights_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_flights.DDT_Air;

public class Flight_Detailspage{
WebDriver driver;
	
	@FindBy(xpath="//div[@class='bbcaaa85']")
	WebElement flight_details;
	
	@FindBy(xpath="//div[.='View baggage and cancellation policy']")
	WebElement baggage_canc_policy;
	
	@FindBy(xpath="(//div[@class='_6f50d214']/div)[2]")
	WebElement baggage_policy;
	
	@FindBy(xpath="(//div[@class='tabListInner'])[2]")
	WebElement canc_link;
	
	@FindBy(xpath="//div[@class='_59ffa092']")
	WebElement canc_rules;
	
	@FindBy(xpath="//div[.='View fare details']")
	WebElement fare_details;
	
	@FindBy(xpath="(//div[@class='cf7081ff']/div/div/strong)[2]")
	WebElement fare_price;
	
	@FindBy(linkText="Proceed to traveller details")
	WebElement proceed_paxdetails;
	
	@FindBy(xpath="(//div[@class='_543f9333']/div/div/button)[1]")
	WebElement apply_couponbtn;
	
	public WebElement flightdetails()
	{
		return flight_details;           
	}

	public void baggage_and_canc()
	{
		baggage_canc_policy.click();        
	}
	
	public WebElement baggagerules()
	{
		return baggage_policy;           
	}

	public void cancellation_link()
	{
		canc_link.click();        
	}
	
	public WebElement cancel_rules()
	{
		return canc_rules;    
	}
	
	public void view_faredetails()
	{
		fare_details.click();        
	}
	
	public WebElement total_amount()
	{
		return fare_price;      
	}
	
	public void click_proceedtravellerdetails()
	{
		proceed_paxdetails.click();      
	}
	
	public void click_applycoupon()
	{
		apply_couponbtn.click();
	}
	
	public WebElement discount_offer()
	{
		return apply_couponbtn;
	}
	
	public Flight_Detailspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
