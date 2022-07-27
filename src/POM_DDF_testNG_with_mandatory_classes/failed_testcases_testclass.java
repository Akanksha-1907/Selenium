package POM_DDF_testNG_with_mandatory_classes;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class failed_testcases_testclass extends BaseClass
{
	Flipkart_homepage hp;
	Flipkart_loginpage lp;
	XSSFSheet sh;
	Actions act;
	//String TestCaseID;
	@BeforeClass
	public void openapp() throws IOException
	{
		configurebrowser();
		
		//created and initialized object of POM classes
		lp =new Flipkart_loginpage(driver);
		hp=new Flipkart_homepage(driver);
		
	}
	@BeforeMethod
	public void loginapp() throws IOException
	{
		lp.mobileno(UtilityClass.Fetchdata(0, 0));
		lp.password(UtilityClass.Fetchdata(0, 1));
		lp.click();
		UtilityClass.screenshot(driver, "Loginpage");
	}
	@Test
	public void verifyuser()throws InterruptedException, IOException
	{
		//TestCaseID="TC_01";    //can give testcase ID
		String actualr=hp.validateusername();
		String expr=UtilityClass.Fetchdata(0, 2);
		Assert.assertEquals(actualr, expr);
		UtilityClass.screenshot(driver, "VerifyUser");
	}
	@AfterMethod
	public void logoutapp(ITestResult result) throws IOException
	{
		
		hp.act(driver);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//UtilityClass.screenShot(driver,Testcaseid);
			
			UtilityClass.screenshot(driver,result.getName());   //get the name of the particular method which got failed.
		}	

		System.out.println("Logout Application");
		UtilityClass.screenshot(driver, "LogOutuser");
		
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
		//destroy all the globally declared objects to save memory...it should not have to wait to all suite to execute.
		driver=null;
		lp=null;
		hp=null;
		sh=null;
	}



}
