package practice11111111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_openmail_sidechedots
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// click on apps WebElement first
		
		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
		
		// now shift to iframe
		
		driver.switchTo().frame("app");
		
		List<WebElement>Totalapps=driver.findElements(By.xpath("//ul[@jsname=\"k77Iif\"]//li"));

		System.out.println(Totalapps.size());
		for(WebElement i:Totalapps) 
		{
			i.getText();
			System.out.println(i.getText());
		}
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
	}
	

}
