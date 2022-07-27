package testNG_data_provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_class
{
	WebDriver driver;
	@BeforeClass
	public void browserset()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(dataProvider="LoginData")
	public void login(String user,String pwd,String status)
	{
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement u=driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		u.clear();
		u.sendKeys(user);
		
		WebElement p=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		p.clear();
		p.sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		System.out.println(user+" "+" "+pwd+" "+status);     //print all the data
		
		//verifying by title
		String expT="Dashboard / nopCommerce administration";
		String actT=driver.getTitle();
		if(status.equals("Valid"))
		{
			if(expT.equals(actT))
			{
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if(status.equals("Invalid"))
		{
			if(expT.equals(actT))
			{
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	
	//data provider method returns two dimensional array.
	@DataProvider(name="LoginData")
	public String [][] getdata()
	{
		String logindata[][]= {{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstore.com","adm","Invalid"},
				{"adm@yourstore.com","admin","Invalid"},
				{"adm@yourstore.com","adm","Invalid"}
				};
		return logindata;
				
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
