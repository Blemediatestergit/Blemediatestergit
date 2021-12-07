package Browser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	
	public WebDriver driver;

	@BeforeSuite
	public void report()

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://stagingrv4.redtie.co/SignIn");
		driver.manage().window().maximize();
		driver.getTitle();
		
	}

	@BeforeMethod
	public void BrowserOpen()  {
		
		
		DateFormat date = new SimpleDateFormat("HH:MM a");
		Date SystemDate = new Date();
		String dateformat = date.format(SystemDate);

		System.out.println(dateformat);

		// Plus some hours, minutes, and seconds to the original DateTime.

	}

	@AfterMethod
	public void Close_Browser() {

		driver.close();
	}

	@AfterSuite
	public void Flush_Report() {

	}

}
