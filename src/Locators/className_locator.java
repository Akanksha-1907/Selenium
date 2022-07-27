package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class className_locator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2Fmys%2Fhome%3Fsource%3DGBH&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252Fmys%252Fhome%253Fsource%253DGBH");   //open the browser
		Thread.sleep(2000);
		
		driver.findElement(By.className("textbox__control textbox__control--underline qm-element-masked")).sendKeys("Ashu");
		Thread.sleep(5000);
		driver.findElement(By.className("textbox__control textbox__control--underline qm-element-masked")).sendKeys("Heda");
		Thread.sleep(5000);
		driver.findElement(By.className("textbox__control textbox__control--underline qm-element-masked")).sendKeys("Heda@abc.com");
		Thread.sleep(5000);
		driver.findElement(By.className("textbox__control textbox__control--underline qm-element-masked")).sendKeys("Ashu123#");
		Thread.sleep(5000);
		driver.findElement(By.className("_btn btn--primary btn--large btn--fluid")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
