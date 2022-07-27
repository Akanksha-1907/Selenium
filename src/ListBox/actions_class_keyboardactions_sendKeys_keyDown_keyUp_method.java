package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class_keyboardactions_sendKeys_keyDown_keyUp_method
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement user=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		Actions act=new Actions(driver);
		
		//Use sendKeys();--->To enter the username
		act.sendKeys(user,"Akanksha").perform();
		
		//Select the text i.e.Akanksha from the username box--->for that we have to press control+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//Copy the selected text---->for that we have to press control+c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//We have to paste that copied text in the password field
		pass.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
	}

}
