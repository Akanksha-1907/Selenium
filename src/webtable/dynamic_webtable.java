package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_webtable 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www2.asx.com.au/");
		driver.manage().window().maximize();
		
		//Click on Accept Cookies
		driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
		Thread.sleep(2000);
		
		//Click on the  S&P ASX200 TOP 5
		driver.findElement(By.xpath("//nav[@id=\"pnProductNav\"]/descendant::h5[2]")).click();
		Thread.sleep(2000);
		
		//Count the number of rows in the table
		List<WebElement>row=driver.findElements(By.xpath("(//div[@class=\"col-xs-12 col-sm-6 col-md-4\"])[1]/descendant::tr"));
		int r=row.size();
		System.out.println("Number of rows in the table : "+r);
		Thread.sleep(2000);
		
		//Count the number of Columns in the table
		List<WebElement>col=driver.findElements(By.xpath("(//div[@class=\"col-xs-12 col-sm-6 col-md-4\"])[1]//th"));
		int c=col.size();
		System.out.println("Number of columns in the table : "+c);
		
		//Print the whole table
		//print column
		for(int i=1;i<=c;i++)
		{
			WebElement wr=driver.findElement(By.xpath("(//div[@class=\"col-xs-12 col-sm-6 col-md-4\"])[1]//th["+i+"]"));
			String a=wr.getText();
			System.out.print(a+" ");
		}
		//print row
		System.out.println();
		for(int j=2;j<=r;j++)
		{
			WebElement wc=driver.findElement(By.xpath("(//div[@class=\"col-xs-12 col-sm-6 col-md-4\"])[1]//tr["+j+"]"));
			String b=wc.getText();
			System.out.println(b);
			System.out.println("***************");
		}
	}

}
