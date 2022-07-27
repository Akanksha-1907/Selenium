package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_startswith_method_attribute_text 
{
	//-->//tagname[starts-with(@attributename,"starting attribute vale"")]----->using attribute
	//--->//tagname[starts-with(text(),"starting text value")]----------------->using text
	//---->(//tagname[starts-with(text(),"starting text value")])[2]------>indexing if the values are not 1 on 1
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open flipkart site
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//close the signup page
		driver.findElement(By.xpath("//button[starts-with(@class,\"_2KpZ6l _2d\")]")).click();
		Thread.sleep(2000);
		
		//click on the mobiles
		driver.findElement(By.xpath("//img[starts-with(@alt,\"Mob\")]")).click();
		Thread.sleep(4000);
		
		//click on the poco mobiles
		driver.findElement(By.xpath("(//img[starts-with(@alt,\"Shop Now\")])[2]")).click();
		Thread.sleep(2000);
		
		//click on one poco phone
		driver.findElement(By.xpath("//div[starts-with(text(),\"POCO C31 (Royal Blue, 6\")]")).click();
		Thread.sleep(2000);
		
		//Quit the browser
		driver.quit();
		
		
		
	}

}
