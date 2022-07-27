package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_method_attribute_text
{
	//--->//tagname[contains(@attributename,"partial name")]----->attribute---->use when tags are present
	//--->//tagname[contans(text(),"partial name")]-------------->text-->use when text is present like in links
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Windows/Desktop/html.html"); //open the webpage
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//enter username
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Enter N\")]")).sendKeys("Pqrst");
		Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.xpath("//input[contains(@id,\"pa\")]")).sendKeys("yxz");
		Thread.sleep(2000);
		
		//open facebook page
		driver.findElement(By.xpath("//a[contains(text(),\"ook\")]")).click();
		Thread.sleep(2000);
		
		//close the tab
		driver.close();
		
		
	}

}
