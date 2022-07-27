package testNG_keywords_suites;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods
{
	//Adding include and exclude keywords to run particular test methods for that first convert class into test suite.
	@Test(dependsOnMethods= {"m3"})
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}
}





