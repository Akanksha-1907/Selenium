package TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_using_PageFactory.flipkart_homepage_POM;
import POM_using_PageFactory.flipkart_loginpage_POM;

public class testNG_annotation_without_DDF_example {
	WebDriver driver;

	@BeforeSuite
	public void launch() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Launch the browser", true);

	}

	@BeforeTest
	public void max()
	{
		driver.manage().window().maximize();
		Reporter.log("Maximizing the browser", true);
	}

	@BeforeClass
	public void openapp() 
	{
		driver.get("https://www.flipkart.com/");
		Reporter.log("Open the flipkart application", true);
	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException 
	{
		flipkart_loginpage_POM lp = new flipkart_loginpage_POM(driver);
		lp.mobileno();
		lp.password();
		lp.click();
		Thread.sleep(2000);
	}

	@Test
	public void verfication() throws InterruptedException 
	{
		Reporter.log("Test Case 1 executed and verification is done", true);
		flipkart_homepage_POM hp = new flipkart_homepage_POM(driver);
		hp.validateusername();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void logout() throws InterruptedException 
	{
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//div[text()='Pooja']"));
		act.moveToElement(user).perform();
		driver.findElement(By.xpath("//div[text()=\"Logout\"]")).click();
		Reporter.log("Logout the application", true);
	}

	@AfterClass
	public void closeapp()
	{
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
