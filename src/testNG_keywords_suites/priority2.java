package testNG_keywords_suites;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority2
{
	@Test(priority=1)
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(priority=-2)
	public void m3()
	{
		Assert.fail();
		Reporter.log("Running test case 3",true);
	}


}
