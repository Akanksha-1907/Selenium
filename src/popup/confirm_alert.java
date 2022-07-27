package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirm_alert 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		//Click on the click me button of confirmbox alert
		driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
		Thread.sleep(2000);
		
		//Switch the focus of selenium from main webpage to the alert
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		
		//Print the text present in the alert box
		System.out.println(a.getText());
		Thread.sleep(2000);
		
		//Click on the OK 
		a.accept();
		Thread.sleep(2000);
		//OR --->Click on the cancel
		//a.dismiss();
		
		//print output of action performed on alert box
		WebElement output=driver.findElement(By.xpath("//div[@id=\"output\"]"));
		System.out.println(output.getText());


		//Close the tab
		driver.close();
		
	}

}
