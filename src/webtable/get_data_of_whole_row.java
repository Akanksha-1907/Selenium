package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_data_of_whole_row
{
	public static void main(String[] args) throws InterruptedException
	{
		//To get data from the whole row of the webtable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
		WebElement data=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[4]/td["+i+"]"));
		String a=data.getText();
		System.out.print(a+" ");
		
		}
		
		
	}

}
