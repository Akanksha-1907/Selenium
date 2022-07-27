package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class_dragAndDrop_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//Find the path for elements which you have to drag
		List<WebElement>lw=driver.findElements(By.xpath("//a[@class=\"button button-orange\"]"));
		WebElement drag=lw.get(2);
		WebElement drop=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		
		//Create the Actions Class
		Actions act=new Actions(driver);
		
		//Perform the drag and drop Action
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		
	}

}
