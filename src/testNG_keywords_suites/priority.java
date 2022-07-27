package testNG_keywords_suites;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority
{
	@Test(priority=3)
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test(priority=1)
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(priority=2)
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}


}
