package amazonflights_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_flights.DDT_Air;

public class Flights_Loginpage extends DDT_Air{
	WebDriver driver;
	
	@FindBy(name="email")                         
	WebElement username;
	
	@FindBy(id="continue")                       
	WebElement continue_button;
	
	@FindBy(id="ap_password")                    
	WebElement password;
	
	@FindBy(id="signInSubmit")                       
	WebElement signin_button;
	
	@FindBy(id="auth-error-message-box")                       
	WebElement login_err_msgbox;
	
	public void enter_username()                
	{
		username.sendKeys(un);
	}
	
	public void cont()                        
	{
		continue_button.click(); 
	}
	
	public void enter_password()                  
	{
		password.sendKeys(pwd);
	}
	
	public void signin()                           
	{
		signin_button.click();
	}
	
	public WebElement login_error()                           
	{
		return login_err_msgbox;
	}
	
	public Flights_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
