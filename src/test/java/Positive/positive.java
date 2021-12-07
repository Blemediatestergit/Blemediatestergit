package Positive;

import org.testng.annotations.Test;

import Browser.browser;
import Login.loginone;

public class positive extends browser{

	@Test(priority=0)
	public void Testone() throws Exception
	{
		loginone log=new loginone(driver);
		log.loginexcel_test();
	
	}
	
}
