package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class_moveToElement_method 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Close the popup
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);
		
		//Find the path of the login button
		WebElement h=driver.findElement(By.xpath("//a[text()='Login']"));
		
		//Create the Action class
		Actions act=new Actions(driver);
		
		//Hover the mouse over the login button
		act.moveToElement(h).perform();     //perform method is use to perform the action
		Thread.sleep(2000);
		
		//Click on the gift card option
		WebElement cl=driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		act.click(cl).perform();
		Thread.sleep(5000);
		
		//Close the browser
		driver.close();
		
		
	}

}
