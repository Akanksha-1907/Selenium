package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		//implicit wait
		//implicitly wait is always applied globally-->it will be available for all the webelements.
		//It is dyanamic in nature.
		//It can be changed at anywhere and at anytime.
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
	
		//click on create new account
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		//first name
		WebElement fname=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		fname.sendKeys("Ashu");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//surname
		WebElement lname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lname.sendKeys("Hedaoo");
		//mobile number
		WebElement mono=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		mono.sendKeys("152406");
		
	}

}
