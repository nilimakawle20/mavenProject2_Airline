package amazonflights_source;

import java.awt.AWTException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights_Homepage {
WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement accountList;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signinbutton;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement accountList1;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signoutbutton;
	
	@FindBy(xpath="(//div[@class='dafe1197'])[1]/label/i")
	WebElement oneway_rb;
	
	@FindBy(xpath="((//div[@class='_3cb848bf'])[1]/div/span)[2]")
	WebElement fromsector;
	
	@FindBy(xpath="//input[@name='searchText']")
	WebElement selectairport_tf1;
	
	@FindBy(xpath="(//p[@class='c9d6cfb6'])[1]")
	WebElement fromairport_op1;
	
	@FindBy(xpath="//input[@name='searchText']")
	WebElement selectairport_tf2;
	
	@FindBy(xpath="(//p[@class='c9d6cfb6'])[1]")
	WebElement toairport_op1;
	
	@FindBy(xpath="(//div[@class='dafe1197'])[2]/label/i")
	WebElement roundtrip_rb;
	
	@FindBy(xpath="((((//div[@class='_1711da50'])[2]/div)[3]/ul)[3]/li)[7]")
	WebElement selected_depdate;
	
	@FindBy(xpath="((((//div[@class='_1711da50'])[2]/div)[3]/ul)[4]/li)[3]")
	WebElement selected_retdate;
	
	@FindBy(xpath="(//div[@class='_79bb5d49']/span)[3]")
	WebElement returndate_tf;
	
	@FindBy(id="rdate")
	WebElement return_date;
	
	@FindBy(xpath="((//div[@class='_75c05602'])[5]/div/div/span)[1]")
	WebElement traveller_cabin;
	
	@FindBy(xpath="(//button[.='4'])[1]")
	WebElement multiple_pax;
	
	@FindBy(xpath="(//button[.='1'])[1]")
	WebElement adult_pax;
	
	@FindBy(xpath="(//div[@class='dafe1197'])[1]/label/i")
	WebElement economy;
	
	@FindBy(xpath="(//div[@class='dafe1197'])[2]/label/i")
	WebElement premiumeconomy;
	
	@FindBy(xpath="(//div[@class='dafe1197'])[3]/label/i")
	WebElement business;
	
	@FindBy(xpath="//button[.='Search']")
	WebElement search_btn;
	
	public void accountlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountList).perform();                
	}
	
	public void signin()
	{
		signinbutton.click();
	}
	
	public void accountlist1(WebDriver driver)
	{
		Actions a2=new Actions(driver);
		a2.moveToElement(accountList1).perform();                
	}
	
	public void signout()
	{
		signoutbutton.click();
	}
	
	public void oneway_rbtn()
	{
		oneway_rb.click();
	}
	
	public void fromsectorclick()
	{
		fromsector.click();
	}
	
	public void select_fromto1()
	{
		selectairport_tf1.sendKeys("BOM");	
	}
	
	public void selectfromairport_op1()
	{
		fromairport_op1.click();	
	}
	
	public void select_fromto2()
	{
		selectairport_tf2.sendKeys("HYD");
	}
	
	public void selecttoairport_op1()
	{
		toairport_op1.click();	
	}
	
	public void roundtrip_rbtn()
	{
		roundtrip_rb.click();
	}
	
	public void departdateselection()
	{
		selected_depdate.click();
	}
	
	public void returndateselection()
	{
		selected_retdate.click();
	}
	
	public void returndateclick1()
	{
		returndate_tf.click();
	}
	
	public void returndateclick()
	{
		return_date.click();
	}
	
	public void traveller_cabinselection()
	{
		traveller_cabin.click();
	}
			
	public void multiplepax_travellers()
	{
		multiple_pax.click();
	}
	
	public void adultpax_travellers()
	{
		adult_pax.click();
	}
	
	public void economy_select()
	{
		economy.click();
	}
	
	public WebElement economyclass()
	{
		return economy;
	}

	public void premiumeconomy_select()
	{
		premiumeconomy.click();
	}
	
	public WebElement preeconomyclass()
	{
		return premiumeconomy;
	}
	
	public void business_select()
	{
		business.click();
	}
	
	public WebElement businessclass()
	{
		return business;
	}
	
	public void click_searchbutton()
	{
		search_btn.click();
	}
	
	public Flights_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
