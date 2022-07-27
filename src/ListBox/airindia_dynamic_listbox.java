package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class airindia_dynamic_listbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		
		//search Pune in the from box
		driver.findElement(By.xpath("//label[@id=\"lblOneWay\"]/following::div[5]/input[@id=\"from\"]")).sendKeys("Pune");
		Thread.sleep(5000);
		
		//select pune from the dropdown
		driver.findElement(By.xpath("//a[text()='Pune, Lohegaon Airport, PNQ, India']")).click();
		Thread.sleep(2000);
		
		//search Mumbai in the to box
		driver.findElement(By.xpath("//input[@id=\"to\"]")).sendKeys("mum");
		Thread.sleep(2000);
		
		//select Mumbai from the dropdown
		driver.findElement(By.xpath("//a[text()='Mumbai, Chhatrapati Shivaji International Airport, BOM, India']")).click();
		Thread.sleep(2000);
		
		//select number of adults
		WebElement adult=driver.findElement(By.xpath("//select[@id=\"ddladult1\"]"));
		adult.click();
		Thread.sleep(2000);
		Select s=new Select(adult);
		s.selectByVisibleText("2");
		Thread.sleep(2000);
		
		//select number of children
		WebElement children=driver.findElement(By.xpath("//select[@id=\"ddlchildren1\"]"));
		children.click();
		Thread.sleep(2000);
		Select s1=new Select(children);
		s1.selectByVisibleText("1");
		Thread.sleep(2000);
				
		//select number of infant
		WebElement infant=driver.findElement(By.xpath("//select[@id=\"ddlinfants1\"]"));
		infant.click();
		Thread.sleep(2000);
		Select s3=new Select(infant);
		s3.selectByVisibleText("1");
		Thread.sleep(2000);
		
		//select the class i.e. bussiness /economy/first
		WebElement eco=driver.findElement(By.xpath(""));
		eco.click();
		Thread.sleep(2000);
		Select s4=new Select(eco);
		s4.selectByValue("First");
		Thread.sleep(2000);
		
		//select concession type
		driver.findElement(By.xpath("//select[@id=\"concessionaryType1\"]")).click();
		Thread.sleep(2000);
		//select as armed forces
		driver.findElement(By.xpath("//select[@id=\"concessionaryType1\"]/child::option[2]")).click();
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();
		
	}

}
