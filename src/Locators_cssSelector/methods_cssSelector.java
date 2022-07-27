package Locators_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods_cssSelector
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Methods of cssSelector
		//1)--->using id attribute-->tagname#idattributevalue.
		//2)-->using class attribute---->tagname.classnamevalue.
		//3) -->hybrid-->tagname#idattributevalue[attributename="attributevalue"]
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open flipkart site
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//close the signup page
		driver.findElement(By.cssSelector("button[class=\"_2KpZ6l _2doB4z\"]")).click();   //---->tagname[attributename="attributevalue"]--->using any attribute
		Thread.sleep(2000);
		
		//click on the mobiles
		driver.findElement(By.cssSelector("img[src^=\"https://rukminim1.flixcart.com/flap/128/128/image/22fddf3c7da4c4f4.png?q=100\"]")).click();   //---->Using Substring
		//-->tagname[attributename^="Starting value"]--->startswith--^
		Thread.sleep(4000);
		
		//click on the poco mobiles
		driver.findElement(By.cssSelector("img[src$=\"https://rukminim1.flixcart.com/flap/240/240/image/8e8ae4fdd4f3b773.jpg?q=90\"] ")).click();   //-->Using substring
		//-->tagname[attributename$="Ending value"]----->endswith--$
		Thread.sleep(2000);
		
		//click on one poco phone
		driver.findElement(By.cssSelector("img[alt*=\"POCO M4 Pro 5G (Cool Blue, 6\"]")).click();  //--->Using substring
		//-->tagname[attributename*="Partial value"]----->contains--*
		Thread.sleep(2000);
		
		//Quit the browser
		driver.quit();
		
		
		
	}

}
