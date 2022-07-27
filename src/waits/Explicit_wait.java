package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait 
{
	//Explicit Wait
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//click on create new account
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		//first name
		WebElement fname=driver.findElement(By.xpath("//div[@id=\"fullname_field\"]/descendant::div/descendant::div//input[@name=\"firstname\"]"));
		//surname
		WebElement lname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		//mobile number
		WebElement mono=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		//click on learn more
		WebElement learn=driver.findElement(By.xpath("//a[@id=\"non-users-notice-link\"]"));
		
		sendKey(driver, fname, "Ashu", 10);
		sendKey(driver, lname, "Hedaoo", 5);
		sendKey(driver, mono, "5246378910", 5);
		click(driver, learn, 10);
		
	}

	//Utility
	public static void sendKey(WebDriver driver,WebElement element,String value,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void click(WebDriver driver,WebElement element,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	//Explicit Wait
	//1)-->There is no keyword or method for explicit wait.
	//2)-->It is available with WebDriverWait with some ExpectedConditions.
	//3)-->It is specific to element.
	//4)-->It is dynamic in nature i.e. when we have givern wait of 10 sec and element get loaded in 5 sec...then it will not wait 10 sec to complete,
	//it will directly move to next element.
	//Note--->We should never use Implicitly wait and explicit wait together-->because,it will add the time of bothe and so execution time will require more.

}
