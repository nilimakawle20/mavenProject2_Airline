package amazonflights_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_SeatSelectionpage {
WebDriver driver;
	
	@FindBy(xpath="//button[.='Next']")                         
	WebElement next_btn;
	
	@FindBy(xpath="//h2[.='Select Seat']")                         
	WebElement selectseat;
	
	@FindBy(xpath="//button[.='Yes, proceed']")                         
	WebElement proceed_withoutseat;
	
	public void click_nextbutton()                
	{
		next_btn.click();
	}
	
	public void proceed_withoutseatselection()                
	{
		proceed_withoutseat.click();
	}
	
	public WebElement heading_select_seat()                
	{
		return selectseat;
	}
	
	public Flight_SeatSelectionpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
