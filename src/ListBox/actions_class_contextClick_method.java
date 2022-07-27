package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class_contextClick_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		//Right click on the particular button
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
		Thread.sleep(2000);
		
		//WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		//	Actions act=new Actions(driver);
		//act.contextClick(ele);
		
		//Now select paste from the list---->paste in 4th postion so apply for loop
		for(int i=0;i<4;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		
		//Now click enter
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
}
}
