package take_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class methods_for_screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(5000);
		
		//Step 1)----->Typecast WebDriver object into TakesScreenshot() Interface
		TakesScreenshot screen=(TakesScreenshot)driver;
		
		//Step 2)----->Call the method getScreenShotAs() and pass the argument as OutputType.FILE
		screen.getScreenshotAs(OutputType.FILE);
		
		//Step 3)----->Define the source to the file
		//returntype of file is file
		
		File src=screen.getScreenshotAs(OutputType.FILE);
		
		//Step 4)---->Store the screenshot in the particular folder in your PC
		
		File destination=new File("C:\\Users\\Windows\\Desktop\\Selenium_Screenshots\\Flipkart_sample_ex\\frontpageflipkart.jpg");
		FileHandler.copy(src, destination);        //FileHnadler throws IO exception
		
		
		//Taking screenshot of particular section of page and particular element on a page-->for element copy path of that element
		WebElement pagesection=driver.findElement(By.xpath("//div[@data-tracking-id=\"Deals of the Day\"]"));
		File pgc=pagesection.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(pgc, destination);
		
	}

}
