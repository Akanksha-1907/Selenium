package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_auto_L 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Click on the Components
		driver.findElement(By.xpath("//a[text()='Components']")).click();
		Thread.sleep(2000);
		
		//Click on the Monitors
		driver.findElement(By.xpath("//a[text()='Monitors (2)']")).click();
		Thread.sleep(2000);
		
		//Click on show and select 75
		WebElement show=driver.findElement(By.xpath("//select[@id=\"input-limit\"]"));
		show.click();
		Select sc=new Select(show);
		sc.selectByVisibleText("75");
		Thread.sleep(2000);
		
		//Click on the Apple Cinema
		driver.findElement(By.xpath("//a[text()='Apple Cinema 30\"']")).click();
		Thread.sleep(2000);
		
		//Select the available options
		//1)----->Select small as radio button
		driver.findElement(By.xpath("//div[@id=\"input-option218\"]/descendant::label/input")).click();
		Thread.sleep(2000);
		
		//2)----->Select checkbox 2
		driver.findElement(By.xpath("//div[@id=\"input-option223\"]/descendant::label[2]/input")).click();
		Thread.sleep(2000);
		
		//3)---->Enter Text as laptop
		WebElement text=driver.findElement(By.xpath("//input[@id=\"input-option208\"]"));
		text.clear();
		Thread.sleep(1000);
		text.sendKeys("Laptop");
		Thread.sleep(2000);
		
		//4)----->Select colour
		WebElement color=driver.findElement(By.xpath("//select[@id=\"input-option217\"]"));
		color.click();
		Thread.sleep(2000);
		Select se1=new Select(color);
		se1.selectByValue("1");
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();
		
		
		
		
		
	}

}
