package practice11111111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class types_of_dropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/dropdowns");
		
		//Dropdown of Products
		
		WebElement pro=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		pro.click();
		Thread.sleep(2000);
		Select sc=new Select(pro);
		sc.selectByValue("Apple");
		Thread.sleep(2000);
		
		//Dropdown of animals
		
		WebElement ani=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		ani.click();
		Select sc1=new Select(ani);
		List<WebElement>lw=sc1.getOptions();
		for(WebElement w:lw)
		{
			System.out.println(w.getText());
		}
		Thread.sleep(2000);
		sc1.selectByVisibleText("Avatar");
		
		//Custom Dropdown
		
		WebElement cus=driver.findElement(By.xpath("//button[@id=\"custom\"]"));
		cus.click();
		Actions act=new Actions(driver);
		for(int i=1;i<=3;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		//Food Items Multiple Selection
		WebElement fo=driver.findElement(By.xpath("//select[@id=\"second\"]"));
		Select sc2=new Select(fo);
		Thread.sleep(2000);
		sc2.selectByVisibleText("Pizza");
		sc2.selectByVisibleText("Burger");
		sc2.selectByVisibleText("Bonda");
		Thread.sleep(2000);
		
		//Close the Browser
		driver.close();
		
		
		
	}

}
