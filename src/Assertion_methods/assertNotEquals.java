package Assertion_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNotEquals 
{
	@Test()
	public void m2()
	{
		String actualResult="Good Morning";
		String expectedResult="Good Morning";
		Assert.assertNotEquals(actualResult,expectedResult);
		
	}


}
