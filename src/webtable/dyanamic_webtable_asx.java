package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanamic_webtable_asx 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//Click on the Accept Cookies
		driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
		Thread.sleep(2000);
		
		//Count the number of rows
		List<WebElement>row=driver.findElements(By.xpath("//table[@class=\"table\"]//thead/tr/following::tr"));
		int a=row.size();
		System.out.println(a);
		
		//Count the number of columns
		List<WebElement>col=driver.findElements(By.xpath("//table[@class=\"table\"]//thead//th"));
		int b=col.size();
		System.out.println(b);
		
		//Print the Whole Table
		//Print columns
		for(int i=1;i<=b;i++)
		{
			WebElement wc=driver.findElement(By.xpath("//table[@class=\"table\"]//thead//th["+i+"]"));
			String p=wc.getText();
			System.out.print(p+"  ");
		}
		System.out.println();
		//print row
		for(int j=1;j<=a;j++)
		{
			WebElement wr=driver.findElement(By.xpath("//table[@class=\"table\"]//thead/tr/following::tr["+j+"]"));
			String q=wr.getText();
			System.out.println(q);
			System.out.println("*****************");
		}
		
		
	}
}
