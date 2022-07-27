package grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1
{
	//create suites to execute
	@Test(groups="Sanity")
	public void m1()
	{
		Reporter.log("Running test case 1",true);
	}
	
	@Test(groups={"Regression","Sanity"})
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}
	
	@Test(groups="Sanity")
	public void m3()
	{
		Reporter.log("Running test case 3",true);
	}
	@Test(groups="Sanity")
	public void m4() throws InterruptedException
	{
		Reporter.log("Running test case 4",true);
	}
	
	@Test(groups="Regression")
	public void m5()
	{
		Reporter.log("Running test case 5",true);
	}
	
	@Test(groups="Regression")
	public void m6()
	{
		Reporter.log("Running test case 6",true);
	}


}
