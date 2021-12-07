package Excel;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Report {

	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;

	@Test
	public void Test()
	{
	ExtentHtmlReporter  htmlReporter=new ExtentHtmlReporter("E:\\Dummy\\extentReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String Url ="https://app.redtie.co/SignIn";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.getTitle();
//		test.log(Status.PASS,"opened");

	}


}
