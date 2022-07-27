package Assertion_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNotNull
{
	@Test
	public void m6()
	{
		String actualResult="Good Morning";
		Assert.assertNotNull(actualResult);
	}


}
