package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class flipkart_xpath
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		screenshot("Frontpageofflipkart");
		
		// Click on Mobiles options 
		driver.findElement(By.xpath("//img[@src=\"https://rukminim1.flixcart.com/flap/128/128/image/22fddf3c7da4c4f4.png?q=100\"]")).click();
		Thread.sleep(2000);
		screenshot("Clickonthemobile");
		driver.findElement(By.xpath("//img[@src=\"https://rukminim1.flixcart.com/flap/240/240/image/0f46b1ccbe7d0620.jpg?q=90\"]")).click();
		Thread.sleep(3000);
		screenshot("selecttheparticularmobile");
	}
	public static void screenshot(String fname) throws IOException
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Windows\\Desktop\\Selenium_Screenshots\\Flipkart_sample_ex\\"+fname+".jpg");
		FileHandler.copy(src,dest);
	
	}

}
