package amazonflights_test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility_flights.Listener2;

public class Launch_Quit2 extends Listener2{
	@BeforeMethod
	public void launch_browser ()
	{
	//	ChromeOptions o1=new ChromeOptions();
	//	o1.addArguments("--disable-notifications");
	//  driver=new ChromeDriver(o1);
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_32");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}
}
 