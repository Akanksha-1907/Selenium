package practice11111111;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_sank 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Remote\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=\"MNC\"]")).click();
		Thread.sleep(1000);
		
		//Step 1)--->Get address of parent window
		String p=driver.getWindowHandle();
		
		//Step 2)---->Get the address of child windows
		Set<String> c=driver.getWindowHandles();
		 
		//Step 3)---->Switch focus from parent to particular child window
		for(String g:c)
		{
			
				//Get title of each and every child browser window 
				String title=driver.switchTo().window(g).getTitle();
				
				//Check the condition that gettitle is equals to expected title
				if(title.contains("Mnc Jobs, 61142 Mnc Job Vacancies In June 2022 - Naukri.com"))
				{
					//perform action on the window and close the window
					//a)Click on WFH
					driver.findElement(By.xpath("(//i[@class=\"fleft naukicon naukicon-checkbox\"])[4]")).click();
					Thread.sleep(5000);
					//b)Click on Role category
					driver.findElement(By.xpath("(//i[@class=\"naukicon naukicon-arrow fleft\"])[4]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//i[@class=\"fleft naukicon naukicon-checkbox\"])[22]")).click();
					Thread.sleep(2000);
					
					
				}
				else 
				{
				driver.close();
			}
						
	}

	}
}
