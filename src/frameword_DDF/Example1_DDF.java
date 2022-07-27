package frameword_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Example1_DDF 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\Framework_BDD.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		//Enter the value in the username fileld of popupbox
		String username=sheet.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(username);
		
		//Enter the password in password field
		String password=sheet.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		
		//Click on the login button
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(2000);
		
		//Verify that the user is logged in the application by verifying the name poppedup in the login button name
		WebElement name=driver.findElement(By.xpath("//div[text()=\"Pooja\"]"));
		String actusername=name.getText();
		System.out.println(actusername);
		String expusername="Pooja";
		if(actusername.equalsIgnoreCase(expusername))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
		Actions act=new Actions(driver);
		WebElement user=driver.findElement(By.xpath("//div[text()=\"Pooja\"]"));
		act.moveToElement(user).perform();
		
		driver.findElement(By.xpath("//div[text()=\"Logout\"]")).click();
		
		
		
		
		
	}

}
