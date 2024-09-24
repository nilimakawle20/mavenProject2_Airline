package amazonflights_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_flights.DDT_Air;

public class Flights_SearchResultpage{
    WebDriver driver;
	
	@FindBy(xpath="(//button[.='Book'])[2]")                         
	WebElement book_btn;
	
	public void book_flight()                
	{
		book_btn.click();
	}
	
	public Flights_SearchResultpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
