package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_whole_table 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//To print the whole table
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
			WebElement row=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr/th["+i+"]"));
			String a=row.getText();
			System.out.print(a+"  ");
		}
		System.out.println();
		for(int j=2;j<=7;j++)
		{
			WebElement col=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody//tr["+j+"]"));
			String b=col.getText();
			System.out.println(b);
		}
		
	}
		
}


