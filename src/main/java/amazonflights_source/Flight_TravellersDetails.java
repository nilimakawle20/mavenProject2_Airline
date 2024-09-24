package amazonflights_source;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_flights.DDT_Air;

public class Flight_TravellersDetails extends DDT_Air {
WebDriver driver;
    
	@FindBy(xpath="//div[.='Add new adult']")
	WebElement add_newadults;
	
	@FindBy(xpath="//div[@class='edb7cb84']")
	WebElement gender_drpdown;
	
	@FindBy(xpath="//div[@class='edb7cb84']/ul/li[1]")
	WebElement gender_male;
	
	@FindBy(xpath="//div[@class='edb7cb84']/ul/li[2]")
	WebElement gender_female;
	
	@FindBy(id="input-first_name")
	WebElement first_middle_name;
	
	@FindBy(id="input-last_name")
	WebElement last_name1;
	
	@FindBy(xpath="(//div[@id='fl_tr_cnf_change']/button)[1]")
	WebElement addadult_btn;
	
	@FindBy(id="(//div[@id='fl_tr_cnf_change']/button)[2]")
	WebElement dismiss_btn;
	
	@FindBy(xpath = "//div[@class='c172d511']/label/i")
	WebElement passenger_checkbox;
	
	@FindBy(xpath="//button[.='Proceed to seat selection']")
	WebElement proceed_seatselection;
	
	@FindBy(id="input-mobile")
	WebElement mobile_num;
	
	@FindBy(id="input-email")
	WebElement email_id;
	
	public void click_addNewAdult()
	{
		add_newadults.click();            
	}
	
	public void click_gender_drpdown()
	{
		gender_drpdown.click();            
	}
	
	public void genderDropMale()
	{
		gender_male.click();
	}
	
	public void genderDropFemale()
	{
		gender_female.click();
	}
	
	DDT_Air d=new DDT_Air();
	public void addfirstname(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException
	{
		d.getDataFromExcelSheet1(sheetname, row, cell);
		first_middle_name.sendKeys(str_value);
	}
	public WebElement firstmiddlename()
	{
		return first_middle_name;
	}
	
	public void addlastname(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException
	{
		d.getDataFromExcelSheet1(sheetname, row, cell);
		last_name1.sendKeys(str_value);
	}
	public WebElement lastname1()
	{
		return last_name1;
	}
	
	public void click_addadult()
	{
		addadult_btn.click();
	}
	
	public void click_dismiss()
	{
		dismiss_btn.click();
	}
	
	public void passengerCheckBox() 
	{
	passenger_checkbox.click();
	}
	
	public void click_proceed_seatselection()
	{
		proceed_seatselection.click();
	}
	
	public WebElement mobile_number()
	{
		return mobile_num;
	}
	
	public WebElement email_address()
	{
		return email_id;
	}
	
	public Flight_TravellersDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
