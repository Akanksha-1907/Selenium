package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet_dynamic_dropdown_flightbooking
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//Select the city from the from box
		driver.findElement(By.xpath("//div[text()='From']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='PNQ']")).click();
		Thread.sleep(2000);
		
		//Select the city from the to box
		driver.findElement(By.xpath("//div[text()='Jaisalmer']")).click();
		Thread.sleep(2000);
		
		//Click on the cross button of the calendar pop-up
		driver.findElement(By.xpath("(//*[@opacity=\".3\"])[1]")).click();
		Thread.sleep(2000);
		
		//Click on the passengers list
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();
		Thread.sleep(2000);
		
		//Select number of adults
		WebElement adult=driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
		for(int i=1;i<=2;i++)
		{
			adult.click();
		}
		Thread.sleep(5000);
		
		//Select number of children
		WebElement children=driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
		for(int i=0;i<=2;i++)
		{
			children.click();
		}
		Thread.sleep(2000);
		
		//Select number of infants
		WebElement infant=driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
		infant.click();
		Thread.sleep(2000);
		
		//Select currency from the list
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='EUR']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
