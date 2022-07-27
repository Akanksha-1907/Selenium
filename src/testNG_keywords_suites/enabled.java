package testNG_keywords_suites;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled
{
	@Test
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(enabled=false)
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}


}
