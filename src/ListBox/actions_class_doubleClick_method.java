package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class_doubleClick_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Find the path of the button
		WebElement dou=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//Create action class
		Actions act=new Actions(driver);
		
		//Double click on the button
		act.doubleClick(dou).perform();
		Thread.sleep(2000);
		
		
	}

}
