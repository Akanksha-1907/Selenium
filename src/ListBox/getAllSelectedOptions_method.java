package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions_method
{
	//getAllSelectedOption method--->This method is used to get only selected options present in the listBox.
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role=\"button\" and @rel=\"async\"]")).click();
		Thread.sleep(4000);
		
		//Step 1--->
		WebElement we=driver.findElement(By.tagName("select"));
		we.click();
		Thread.sleep(2000);
		
		//Step 2--->
		Select sc=new Select(we);
		sc.selectByIndex(3);
		sc.selectByIndex(5);
		sc.selectByIndex(7);
		Thread.sleep(2000);
		
		//Step 3--->
		List<WebElement>wl=sc.getAllSelectedOptions();
		for(WebElement w:wl)
		{
			System.out.println(w.getText());
		}
		
	}

}
