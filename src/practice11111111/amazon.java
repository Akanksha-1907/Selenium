package practice11111111;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//Click on Today's Deal
		WebElement todaysdeal=driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		click(driver, todaysdeal, 10);
		//click on the dark chocolate craneberry
		WebElement choco=driver.findElement(By.xpath("//div[text()=\"Best Deal on Food Product and Others\"]"));
		click(driver, choco, 10);
		//Click on the coconut virgin oil
		WebElement coco=driver.findElement(By.xpath("(//img[@alt=\"asin image url\"])[1]"));
		click(driver, coco, 10);
		driver.close();
		
	}
	public static void click(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver,Duration.ofSeconds(timeout)).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
