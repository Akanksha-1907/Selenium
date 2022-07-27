package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_number_of_rows 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//To get number of rows present in webtable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		int a=rows.size();
		System.out.println("Number of rows in a table : "+a);
	}

}
