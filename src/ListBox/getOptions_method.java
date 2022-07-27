package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions_method
{
	//getOptions();--->Provides all the options and print them on console
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role=\"button\" and @rel=\"async\"]")).click();
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		year.click();
		
		Select y=new Select(year);
		List<WebElement>lw=y.getOptions();     //returntype of getOptions() is--->list of webelements
		for(WebElement o:lw)
		{
			System.out.println(o.getText());    //print the value on console
		}
		
	}

}
