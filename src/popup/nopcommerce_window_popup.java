 package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nopcommerce_window_popup
{
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nopcommerce.com/en/demo");
	Actions ac=new Actions(driver);
	Thread.sleep(2000);
	
	String p=driver.getWindowHandle();
	
	driver.findElement(By.xpath("//a[text()=\"Facebook\"]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[text()=\"Twitter\"]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[text()=\"LinkedIn\"]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[text()=\"YouTube\"]")).click();
	Thread.sleep(2000);
	
    Set<String> c=driver.getWindowHandles();
	
	
	for(String o:c) 
	{
	String titl=driver.switchTo().window(o).getTitle();
	
	if(titl.contains("YouTube")) 
	{  Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("sanket");
		Thread.sleep(1000);
		driver.close();
		
	}

	else if(titl.contains("LinkedIn"))
	{
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.close();
	}
	else if (titl.contains("Twitter")) {
		Thread.sleep(2000);
		
		
         driver.findElement(By.xpath("//span[text()=\"Media\"]")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
//	else {
//		driver.close();
//	}

		
	
		
	}
	driver.quit();
	
}

}


