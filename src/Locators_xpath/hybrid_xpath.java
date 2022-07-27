package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hybrid_xpath 
{
	//-->//tagname[xpathexpression1 and/or xpathexpression2]
	//Example-->//tagname[starts-with(@attributename,"attributevalue") and/or contains(text(),"partialvalue")]
	//Using wildcard operator--->
	//-->//*[@attribute="value"]--->represents all tagname comes under *
	//--->//*[@*="value"]----->represents all attributename comes under *
	//--->//tagname[@*="value"]--->all attribute name in *
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Open the Nykaa site
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on the skin
		driver.findElement(By.xpath("//a[contains(text(),\"skin\") and @target=\"_blank\"]")).click();
		Thread.sleep(5000);
		
		//Click on Aqualogica
		driver.findElement(By.xpath("//div[contains(text(),\"On A\")]")).click();
		Thread.sleep(5000);
		
		//Click on gel+face moisturiser
		driver.findElement(By.xpath("//div[starts-with(text(),\"Aqualogica Hydrate+ Ge\")]")).click();
		Thread.sleep(2000);
		
		//Close all the tabs
		driver.quit();
		
		
		
	}

}
