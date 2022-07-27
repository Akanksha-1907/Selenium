package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_selectable_listbox_validation 
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
		
		//Step 1--->Identify the ListBox
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		day.click();
		
		//Step 2--->Validate that whether the ListBox is multiselectable or not
		Select sc=new Select(day);
		boolean output=sc.isMultiple();     //Here return type is true or false
		driver.close();
		
		if(output==true)
		{
			System.out.println("Test Case is Passed:ListBox is Multiselectable");
		}
		else
		{
			System.out.println("Test Case is Failed:ListBox is not Multiselectable");
		}
		
	}

}
