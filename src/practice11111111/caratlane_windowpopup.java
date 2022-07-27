package practice11111111;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class caratlane_windowpopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.caratlane.com/fashion-jewellery/?filters=silver&utm_source=CaratLane&utm_medium=HPBanner&utm_campaign=SilverDesigns");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@data-src=\"https://images.cltstatic.com/media/product/350/AE00014-SS0000-shirin-e-earrings-in--silver-prd-1-base.jpg\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"The Wing Woman Clover Charm Bracelet in Rose Gold Plated 925 Silver\"]")).click();

		
		String p=driver.getWindowHandle();
		Set<String>c=driver.getWindowHandles();
		Thread.sleep(2000);
		for(String s:c)
		{
			if(!s.equals(p))
			{
				String t=driver.switchTo().window(s).getTitle();
				if(s.contains("Buy Shirin E Earrings In 925 Silver from Shaya by CaratLane"))
				{
					driver.findElement(By.xpath("name=\"pincode\"")).sendKeys("452631");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='ADD TO CART']")).click();
					Thread.sleep(2000);
					driver.close();
				}
				else if(s.contains("Buy The Wing Woman Clover Charm Bracelet In Rose Gold Plated 925 Silver from Shaya by CaratLane"))
				{
					driver.findElement(By.xpath("//input[@id=\"pincode\"]")).sendKeys("127875");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='ADD TO CART']")).click();
					Thread.sleep(2000);
					driver.close();
				}
				else
				{
					driver.close();
				}
			}
			driver.quit();
			
		}
		
	}

}
