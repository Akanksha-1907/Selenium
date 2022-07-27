package Assertion_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals
{
	@Test()
	public void m1()
	{
		String actualResult="Good Morning";
		String expectedResult="Good Mornin";
		Assert.assertEquals(actualResult,expectedResult,"Failed due to both values are different");
	}


}
