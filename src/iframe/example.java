package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Automation\\java\\Selenium_Automation\\browserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		
		//Switch to the frame which have topic
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"frame1\"]")));
		
		//Switch to the frame which have inner frame checkbox
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"frame3\"]")));
		
		//Click on the checkbox
		driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
		Thread.sleep(2000);
		
		//Now switch to the parent frame i.e.previous frame which contains topic
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//iframe[@id=\"frame3\"]/parent::body/child::input")).sendKeys("Ashu");
		
		
		//Now switch to main webpage
		driver.switchTo().defaultContent();
		
		//Now switch to frame which have animals
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"frame2\"]")));
		
		//Now Select the animal as avatar
		driver.findElement(By.xpath("//select[@id=\"animals\"]")).click();
		Actions act=new Actions(driver);
		for(int i=0;i<=3;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
		//Close the Browser
		driver.quit();
		
		
	}

}



