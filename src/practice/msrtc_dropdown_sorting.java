package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class msrtc_dropdown_sorting 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://msrtc.maharashtra.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on English
		driver.findElement(By.xpath("//a[text()=' English']")).click();
		Thread.sleep(2000);
		
		//Enter from
		driver.findElement(By.xpath("//input[@id=\"from_txt\"]")).sendKeys("Nagpur");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class=\"ac_even ac_over\"]")).click();
		Thread.sleep(2000);
		
		//Enter to
		driver.findElement(By.xpath("//input[@id=\"to_txt\"]")).sendKeys("Amravati");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"ac_even ac_over\"]")).click();
		Thread.sleep(2000);
		
		//Enter Date
		driver.findElement(By.xpath("//input[@id=\"journeydate\"]")).sendKeys("20-06-2022");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href=\"javascript:void(0)\"])[2]")).click();
		Thread.sleep(2000);
		
		//Select Bus Service
		WebElement bus=driver.findElement(By.xpath("//select[@id=\"busservicetype\"]"));
		bus.click();
		Select se=new Select(bus);
		List originallist=new ArrayList();
		
		List<WebElement>service=se.getOptions();
		for(WebElement o:service)
		{
			originallist.add(o.getText());
		}
		System.out.println(originallist);
		
		//sort the list
		List templist=new ArrayList();
		templist=originallist;
		
		Collections.sort(templist);
		System.out.println(templist);
		if(originallist==templist)
		{
			System.out.println("DropDown is Sorted");
		}
		else
		{
			System.out.println("Dropdown is not Sorted");
		}
		se.selectByValue("ON");
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();
		
		
		
		
		
		
	}

}
