package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc_dynamic_listbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Step 1---->Accept the terms
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);
		
		//Step 2--->Click on the From and select the place
		
		driver.findElement(By.xpath("//div[@class=\"form-swap col-xs-12 remove-padding\"]//descendant::div[2]/descendant::span[2]/input[starts-with(@class,\"ng-tns-c58-8\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PUNE JN - PUNE']")).click();
		Thread.sleep(2000);
		
		//Step 3---->Click on the To and select the place
		driver.findElement(By.xpath("//div[@class=\"level_1_1 col-xs-12 remove-padding jp-form\"]/descendant::div[5]/descendant::div[3]/descendant::span[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='CHANDIGARH - CDG']")).click();
		Thread.sleep(2000);
		
		//Step 4---->Select the Class
		driver.findElement(By.xpath("//div[@class=\"col-md-5 col-xs-12 remove-padding\"]/child::div[2]/descendant::div[starts-with(@class,\"n\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']")).click();
		Thread.sleep(2000);
		
		//Step 5---->Select the General
		driver.findElement(By.xpath("//div[@class='form-swap col-xs-12 remove-padding']/following::div/descendant::div[starts-with(@class,\"ng-tns-c66-12 ui-dropdown ui-widget ui-state-default ui-corner-all\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='TATKAL']")).click();
		Thread.sleep(2000);
		
		//Step 6--->Click on the Checkbox
		driver.findElement(By.xpath("//label[text()='Flexible With Date']")).click();
		Thread.sleep(2000);
		
		//Step 7--->Close the browser
		driver.close();
	}

}
