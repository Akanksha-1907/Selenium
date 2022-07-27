package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class caratlane 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.caratlane.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		screenshot("frontpageofcaratlane");
		
		//Hover the mouse on the ring
		WebElement we=driver.findElement(By.xpath("//li[@id=\"NavItem-0\"]"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		
		act.moveToElement(we).perform();
		Thread.sleep(2000);
		screenshot("list when the mouse is hoverd over the ring");
		
		WebElement move=driver.findElement(By.xpath("(//div[@class=\"css-p7odfy euel9vd0\"])[1]/descendant::ul/descendant::li[6]/a"));
		act.click(move).perform();
		Thread.sleep(2000);
		
		//Sort by price-->10,000-15,000

		WebElement sort=driver.findElement(By.xpath("(//a[@class=\"e1qd6xet0 css-6yxsag epg3bs00\"])[1]"));
		act.moveToElement(sort).perform();
		Thread.sleep(2000);
		WebElement cli=driver.findElement(By.xpath("(//div[@class=\"filter-text\"])[2]"));
		act.click(cli).perform();
		Thread.sleep(2000);
		screenshot("filter the range from 10000 to 15000");
		
		//Sort by weight ranges
		
		WebElement weight=driver.findElement(By.xpath("(//a[@class=\"e1qd6xet0 css-6yxsag epg3bs00\"])[3]"));
		act.moveToElement(weight);
		Thread.sleep(2000);
		WebElement range=driver.findElement(By.xpath("//div[text()='0-2 g (17)']"));
		act.click(range).perform();
		Thread.sleep(2000);
		screenshot("filter the weight to 0 to 2 gram");
		
		//Sort for Material
		WebElement mat=driver.findElement(By.xpath("(//a[@class=\"e1qd6xet0 css-6yxsag epg3bs00\"])[4]"));
		act.moveToElement(mat);
		Thread.sleep(2000);
		WebElement mat1=driver.findElement(By.xpath("//div[text()='Gold (2)']"));
		act.click(mat1).perform();
		Thread.sleep(2000);
		screenshot("filter the material as gold");
		
		//Sort in see more filters
		/*WebElement fil=driver.findElement(By.xpath("(//a[@class=\"e1qd6xet0 css-6yxsag epg3bs00\"])[5]/following::a[2]"));
		act.moveToElement(fil).perform();
		Thread.sleep(2000);
		//Click on theme
		driver.findElement(By.xpath("(//ul[@class=\"sub-filter\"])[6]/child::li[7]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bow (1)']")).click();
		*/
		//Click on the Ring
		driver.findElement(By.xpath("//span[@class=\"css-1kfywrq\"]")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.caratlane.com/jewellery/drury-hammered-gold-ring-ur00175-yg0000.html");
		Thread.sleep(2000);
		screenshot("Click on the desired ring");
		
		//Close the browser
		driver.quit();
	
		}
	
	public static void screenshot(String file) throws IOException
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Windows\\Desktop\\Selenium_Screenshots\\caratlane\\"+file+".jpg");
		FileHandler.copy(src,dest);
	
	}

}
