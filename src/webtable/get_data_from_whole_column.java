package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_data_from_whole_column 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//To get data from the whole column of the webtable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);
		
		//Printing the heading of the column--->bcz it is in different tag i.e.<th> tag
		WebElement head=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr/th[3]"));
		String b=head.getText();
		System.out.println(b);
		
		for(int i=2;i<=7;i++)
		{
			WebElement data=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]/td[3]"));
			String a=data.getText();
			System.out.println(a);
		}

	}

}
