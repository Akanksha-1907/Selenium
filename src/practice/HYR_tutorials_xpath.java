package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYR_tutorials_xpath 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		//Enter the First Name
		driver.findElement(By.xpath("//h1[text()=\"Register\"]/following::input[1]")).sendKeys("Piku");
		Thread.sleep(2000);
		
		//Enter the Last Name
		driver.findElement(By.xpath("//h1[text()=\"Register\"]/following::input[2]")).sendKeys("Manu");
		Thread.sleep(2000);
		
		//Enter the Email Address
		driver.findElement(By.xpath("//h1[text()=\"Register\"]/following::input[3]")).sendKeys("piku123@gmail.com");
		Thread.sleep(2000);
				
		//Enter the Password
		driver.findElement(By.xpath("//h1[text()=\"Register\"]/following::input[4]")).sendKeys("manu@987");
		Thread.sleep(2000);
				
		//Re-type Password
		driver.findElement(By.xpath("//h1[text()=\"Register\"]/following::input[5]")).sendKeys("manu@987");
		Thread.sleep(2000);
		
		//Click on Register
		driver.findElement(By.xpath("//h1[text()=\"Register\"]/parent::div/child::div[3]/button[1]")).click();
		Thread.sleep(2000);
		
		//Click on Maria Anders checkbox
		driver.findElement(By.xpath("//th[text()=\"Contact\"]/ancestor::tr/ancestor::table//descendant::tr[2]/child::td/input")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
