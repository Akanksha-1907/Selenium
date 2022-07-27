package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class particular_child_window_handeling
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"LinkedIn OrangeHRM group\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"OrangeHRM on Facebook\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"OrangeHRM on twitter\"]")).click();
		Thread.sleep(2000);
		
		//Step1:
		String parentID=driver.getWindowHandle();
		
		//Step2:
		Set<String> childid=driver.getWindowHandles();
		
		//Step3:
		for(String s: childid)
		{
			if(!s.equals(parentID))
			{
				// Step a:
				String actualTitle=driver.switchTo().window(s).getTitle();
				
				//Step b:
				if(actualTitle.contains("LinkedIn"))
				{
					
					//Step c:
					driver.findElement(By.xpath("//input[@id=\"email-or-phone\"]")).sendKeys("abcdf");
					Thread.sleep(2000);
					driver.close();
				}
				driver.close();
				
			}
		}

		
	}

}
