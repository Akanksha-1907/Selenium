package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_webtable_selenium_practice
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Count the Number of Rows
		List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		int a=row.size();
		System.out.println("Number of rows : "+a);
		
		//Count the Number of Columns
		List<WebElement>col=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr/th"));
		int b=col.size();
		System.out.println("Number of columns : "+b);
		
		//Print the whole Table
		//Print columns
		for(int i=1;i<=b;i++)
		{
			WebElement wc=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr/th["+i+"]"));
			String p=wc.getText();
			System.out.print(p+"   ");
			
		}
		System.out.println();
		//Print rows
		for(int j=2;j<=a;j++)
		{
			WebElement wr=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+j+"]"));
			String q=wr.getText();
			System.out.println(q);
			System.out.println("*********************");
			
		}
		Thread.sleep(2000);
		//Click on the Amazon Checkbox
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		Thread.sleep(2000);
		
		//Click on the Click here to Submit button
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//		Thread.sleep(2000);
//		driver.close();
	}
}


