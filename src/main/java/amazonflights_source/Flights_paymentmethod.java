package amazonflights_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flights_paymentmethod {
    WebDriver driver;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")                         
	WebElement creditcard_rb;
	
	@FindBy(name="ppw-accountHolderName")                       
	WebElement nick_name;
	
	@FindBy(name="addCreditCardNumber")                       
	WebElement card_number;
	
    @FindBy(xpath="(//span[@role='button'])[1]")                       
	WebElement expiry_month;
	
	@FindBy(xpath = "(//span[@role='button'])[2]")
	WebElement expiry_yr;
	
//	@FindBy(xpath = "((//div[@class='a-popover-wrapper'])[1]/div/ul/li)[4]")
	
	@FindBy(name="ppw-expirationDate_month")
	WebElement expiry_mnth;
	
	@FindBy(name="ppw-expirationDate_year")
	WebElement expiry_yr26;
	
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")                       
	WebElement enter_carddetails_btn;
	
	public void select_creditcard()                
	{
		creditcard_rb.click();
	}
	
	public void enter_nickname()                        
	{
		nick_name.clear();
		nick_name.sendKeys("Nilima K"); 
	}
	
	public void creditcardnumber()                        
	{
		card_number.sendKeys("3374 8899 7900 9789"); 
	}
	
	public void select_expirymonth()                        
	{
		expiry_month.click(); 
	}
	
	public void select_expiryyear()                        
	{
		expiry_yr.click(); 
	}
	
	public void select_expiry_mnth4()                        
	{
		Select s=new Select(expiry_mnth);
		s.selectByValue("4"); 
	}
	
	public void select_expiry_year26()                        
	{
		Select s=new Select(expiry_yr26);
		s.selectByValue("2026"); 
	}
	
	public void enter_card_details()
	{
		enter_carddetails_btn.click();
	}

	public Flights_paymentmethod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
