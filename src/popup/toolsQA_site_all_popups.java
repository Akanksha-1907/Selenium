package popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class toolsQA_site_all_popups
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		//Click on the 1st button
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		Thread.sleep(2000);
		screenshot("click on the simple alert");
		//Switch the focus
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		screenshot("FocusSwitched");
		//Print the text
		System.out.println(a.getText());
		Thread.sleep(2000);
		//Click OK
		a.accept();
		screenshot("Click on OK");
		
		
		//Click on the 2nd button
		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(7000);
		//Switch the focus
		Alert a1=driver.switchTo().alert();
		//Print the text
		System.out.println(a1.getText());
		//Click OK
		a1.accept();
		

		//Click on the 3rd button
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(2000);
		//Switch the focus
		Alert a2=driver.switchTo().alert();
		Thread.sleep(2000);
		//Print the text
		System.out.println(a2.getText());
		Thread.sleep(2000);
		//Click Cancel
		a2.dismiss();
		
		//Click on the 3rd button
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(2000);
		//Switch the focus
		Alert a3=driver.switchTo().alert();
		Thread.sleep(2000);
		//Enter the text
		a3.sendKeys("Dog");
		//Print the text
		System.out.println(a3.getText());
		Thread.sleep(2000);
		//Click Cancel
		a3.accept();
		
	}
	public static void screenshot(String f) throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File tar=new File("C:\\Users\\Windows\\Desktop\\Selenium_Screenshots\\toolsQA_alert"+f+".jpg");
		FileHandler.copy(src, tar);
	}

}
