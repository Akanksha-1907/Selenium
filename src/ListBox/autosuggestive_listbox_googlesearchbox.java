package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive_listbox_googlesearchbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//Search for the Java in the search box
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Java");
		Thread.sleep(2000);
		
		//Retrieve all elements
		List<WebElement> lw=driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/li"));
		Thread.sleep(3000);
		
		//Visit element one by one from that list,if it is matching with expected then click on that webelement.
		String expresult="javascript";
		for(WebElement w:lw)
		{
			String actual=w.getText();
			if(expresult.equalsIgnoreCase(actual))
			{
				w.click();
				break;
			}
			
		}
		driver.close();
	}

}
