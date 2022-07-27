package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links 
{
	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
//		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("8482809373");
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Hello@1234");
//		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		//driver.findElement(By.xpath("//div[text()=\"Mobiles\"]")).click();
		
		//links --> //a href<http://www.google.com/>
		//images ---> //img href<http://www.test.com/>
		
		//Get the list of all the links and images
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of all links and images--->"+linklist.size());
		
		List<WebElement>activelinks=new ArrayList<WebElement>();
		
		//Iterate linklist : exclude all the links/images which doesn't have any href attribute
		for(int i=0;i<linklist.size();i++)
		{
			if(linklist.get(i).getAttribute("href")!=null)
			{
				activelinks.add(linklist.get(i));
			}
		}
		//Get the size of active links list
		System.out.println("Size of active links and images--->"+activelinks.size());
		//-----------------------------------------------------------------------------
		//check the href rel,with httpconnection api;
		for(int j=0;j<activelinks.size();j++)
		{
			HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();  //returns ok
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
		}
		
		
	}

}
