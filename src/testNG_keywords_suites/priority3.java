package testNG_keywords_suites;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority3 
{
	@Test(priority=1)
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(priority=1)
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}


}
