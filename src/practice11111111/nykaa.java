package practice11111111;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nykaa
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(3000);
		
		// hair
		WebElement e=driver.findElement(By.xpath("(//li[@class=\"MegaDropdownHeadingbox\"])[3]"));
	    
		Actions act=new Actions(driver);
		
		act.moveToElement(e).perform();
		Thread.sleep(3000);
		
		//haifall
		driver.findElement(By.xpath("//a[text()=\"Hairfall & Thinning\"]")).click();
		Thread.sleep(5000);
		
		
		//Brillare Science Shampoo Hair Fall Control
        String p=driver.getWindowHandle();
        Set<String> c=driver.getWindowHandles();
        for(String s:c)
        {
           String t=driver.switchTo().window(s).getTitle();
        {
    	   if(t.contains("Hair Fall Control Products: Buy Anti Hair Fall Products Online in India | Nykaa"))
    	   {
    		   Thread.sleep(1000);
    		   driver.findElement(By.xpath("//div[text()='Brillare Science Shampoo Hair Fall Control']")).click();
    		   Thread.sleep(2000);
    	   }
    	    if(t.contains("Brillare Science Shampoo Hair Fall Control: Buy Brillare Science Shampoo Hair Fall Control Online at Best Price in India | Nykaa"))
    	   {
    		   Thread.sleep(1000);
			   driver.findElement(By.xpath("(//span[text()=\"Add to Bag\"])[1]")).click();
			   Thread.sleep(5000);
			   driver.close();
		   }
    	  
	   }
       
   	}
        //driver.quit();
    	  
  }
		
        }



