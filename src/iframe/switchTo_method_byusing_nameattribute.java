package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTo_method_byusing_nameattribute 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
		Thread.sleep(2000);
		
		//Method 1)----->By using name attribute value
		driver.switchTo().frame("iframeResult");     //Switch to the particular frame
		
		
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();         //clear the text which is already present in the textbox.
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Akanksha");   //giving the input as firstname in textbox.
		
		driver.findElement(By.xpath("//input[@id=\"lname\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Hedaoo");   //gving the input as lastname in textbox.
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();     //click on the submit button.
		
	}

}
