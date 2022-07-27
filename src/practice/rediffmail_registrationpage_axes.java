package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffmail_registrationpage_axes 
{
	//Create New Account
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Enter the Full name
		driver.findElement(By.xpath("//td[text()=\"Full Name\"]/ancestor::tbody/tr[3]/td[3]/input")).sendKeys("Akanksha");
		Thread.sleep(3000);
		
		//Enter the mail-id
		driver.findElement(By.xpath("//form[@action=\"register.php?ref_id=\"]/child::div/descendant::tbody[2]/child::tr[7]/child::td[3]/input[1]")).sendKeys("abc@rediffmail.com");
		Thread.sleep(3000);
		
		//Enter Password
		driver.findElement(By.xpath("//form[@method=\"POST\"]/descendant::table[2]/child::tbody/descendant::tr[9]/child::td[3]/input")).sendKeys("defg#987");
		Thread.sleep(3000);
		
		//Enter Retype Password
		driver.findElement(By.xpath("//td[text()=\"Retype password\"]/following-sibling::td[2]/input")).sendKeys("defg#987");
		Thread.sleep(3000);
		
		//Enter Alternate Email address
		driver.findElement(By.xpath("//input[@id=\"mobno\"]/ancestor::tr/preceding-sibling::tr[6]/descendant::div/descendant::tbody/descendant::td[3]/input")).sendKeys("xyz@tuv.com");
		Thread.sleep(3000);
		
		//Enter Mobile Number
		driver.findElement(By.xpath("//td[@id=\"mob_txt\"]/following::td[2]/child::div[3]/input")).sendKeys("8463012397");
		Thread.sleep(3000);
		
		//Select day month and year of birth
		WebElement dmy=driver.findElement(By.xpath("//td[text()=\"Date of Birth\"]/following::select[1]"));
		dmy.click();
		Select se=new Select(dmy);
		se.selectByVisibleText("03");
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//td[text()=\"Date of Birth\"]/following::select[2]"));
		month.click();
		Select se1=new Select(month);
		se1.selectByVisibleText("JAN");
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//td[text()=\"Date of Birth\"]/following::select[3]"));
		year.click();
		Select se2=new Select(year);
		se2.selectByVisibleText("1999");
		Thread.sleep(2000);
		
		//Select Country and City
		WebElement country=driver.findElement(By.xpath("//span[text()=\"Country\"]/parent::td/following::td[2]/select"));
		country.click();
		Select se4=new Select(country);
		se4.selectByVisibleText("India");	
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("//select[@id=\"country\"]/parent::td/parent::tr/following::tr[2]/descendant::tbody/descendant::td[3]/select"));
		city.click();
		Select se5=new Select(city);
		se5.selectByVisibleText("Pune");	
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
