package Assertion_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNull 
{
	@Test
	public void m5()
	{
		String actualResult=null;
		Assert.assertNull(actualResult);
	}


}
