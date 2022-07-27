package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_handelling_selectmethods 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role=\"button\" and @rel=\"async\"]")).click();
		Thread.sleep(2000);
		
		//Step 1-->Identify ListBox Elements
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		day.click();
		Thread.sleep(2000);
		
		//Step 2--->Create object of Select class
		Select se=new Select(day);
		
		//Step 3--->Select option by using method--->1) selectByValue();  2)selectByVisibleText();  3) selectByIndex();
		//Can use any one from the three methods
		//These are the select methods
		se.selectByValue("3");
		
		se.selectByVisibleText("19");
		
		se.selectByIndex(5);
		
	}

}
