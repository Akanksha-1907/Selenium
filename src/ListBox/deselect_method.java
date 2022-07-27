package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect_method
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Windows/Desktop/html.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Step 1-->
		WebElement we=driver.findElement(By.tagName("select"));
		
		//Step 2--->Create object by using select class
		Select se=new Select(we);
		se.selectByValue("3");
		se.selectByVisibleText("Dancing");
		se.selectByVisibleText("Blogging");
		Thread.sleep(2000);
		
		se.deselectAll();            //It de-selects all the selected values
		//se.deselectByIndex(2);       //It de-selects the value of which the index is provided.
		//se.deselectByValue("3");    //It de-selects the value of the the value is provided.
		//se.deselectByVisibleText("Dancing");  //It de-selects the value of which the valus which is provided.
		
		
	}

}
