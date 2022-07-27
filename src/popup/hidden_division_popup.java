package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//The pop up for signin when we open flipkart is colourful and can handle by basic way.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//Enter the username in  textbox
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("abcder");
		
		//Enter the password in the textbox
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("bjhb");
		Thread.sleep(1000);
		
		//Click on the submit button
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(1000);
		
		//Close the window
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

	}


}
