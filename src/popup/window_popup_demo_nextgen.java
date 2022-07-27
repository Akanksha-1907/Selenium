package popup;

import java.util.Set;

import org.checkerframework.checker.units.qual.g;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup_demo_nextgen
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@id=\"button1\"])[1]")).click();
		driver.findElement(By.xpath("(//button[@id=\"button1\"])[2]")).click();
		driver.findElement(By.xpath("(//button[@id=\"button1\"])[3]")).click();
		
		String p=driver.getWindowHandle();
		Set<String> c=driver.getWindowHandles();
		for(String s:c)
		{
			if(!s.equals(p))
			{
				String title=driver.switchTo().window(s).getTitle();
				if(title.contains("Welcome to Vinoth Rathinam Tutorials. Happy Learning"))
				{
					driver.close();
				}
				
			}
			driver.switchTo().window(p);
			
		}
	}

}
