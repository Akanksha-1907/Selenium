package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class geFirstSelectedOption_method 
{
	//getFirstSelectedOption--->This methid is used to display first selected option in multiselected listBox.
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role=\"button\" and @rel=\"async\"]")).click();
		Thread.sleep(4000);
		
		//Step 1-->Identify ListBox Element
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		day.click();
		
		//Step 2---> Create Object of Select Class
		Select se=new Select(day);
		se.selectByVisibleText("3");
		String expresult="3";
		
		//Verification-->That the text is present in the list or not
		String actualresult=se.getFirstSelectedOption().getText();
		if(expresult.equalsIgnoreCase(actualresult))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
	}

}
