package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Reporter.log()--->use to print the message on the emailable report, if written with true then print message on emailable report along with console.
//Reporte.log("message",true)
public class testNG_aanotations
{

	@BeforeSuite
	public void browserconfigure()
	{
		Reporter.log("browser setting",true);
	}
	@BeforeTest
	public void browserwindowsetting()
	{
		Reporter.log("code for maximizing",true);
	}
	@BeforeClass
	public void openapplication()
	{
		Reporter.log("Opening an application",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("user login successfully",true);
	}

	@Test
	public void testcase1()
	{
		Reporter.log("Test case 1 executing for user verification",true);
	}

	@AfterMethod
	public void logout()
	{
		Reporter.log("user logout successfully",true);
	}
	
	@Test
	public void testcase2()
	{
		Reporter.log("Test case 2 executing for grosaries",true);
	}
	
	@AfterClass
	public void closeapplication()
	{
		Reporter.log("closing application",true);
	}
	
	@AfterTest
	public void closingbrowser()
	{
		Reporter.log("Closing browser",true);
	}
	
	@AfterSuite
	public void browserchange()
	{
		Reporter.log("browser changing",true);
	}
}

//Quick Notes--->

//1)-->If we have @Test annotation in the class,then selenium will execute Test annotation first.
//Then it will look for before method and then @AfterMethod.Then again it look for test annotation ,
//and if present it will first execute that then @BeforMethod and then @fterMethod.
//2)-->@BeforeClass annotation execute only once.

//3)--->Sequence of execution of annotations is--->
//@BeforeSuite
//@BeforeTest
//@BeforeClass
//            @BeforeMethod
//                            @Test
//            @AfterMethod
//            @BeforeMethod
//                            @Test
//            @AfterMethod
// @AfterClass
//@AfterTest
//@AfterSuite



