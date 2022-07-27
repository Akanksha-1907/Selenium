package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class drawborder_to_element
{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
	
	drawborder(login, driver);
	generateAlert(driver,"There is an issue in login button");
}
	//This method is used when if we have any error in particular element then do the border across that element.
	public static void drawborder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border='5px solid red'", element);
	}
	//This method is used to generate an alert with message that where is the main problem.
	public static void generateAlert(WebDriver driver,String message)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("alert('"+message+"')");
	}
}
