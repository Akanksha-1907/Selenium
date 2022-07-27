package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_data_from_particular_cell 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//To get data from the particular cell of the webtable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);
		
		WebElement cell=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[3]/child::td[2]"));
		String a=cell.getText();
		System.out.println("Text present in row 3 and col 2 is : "+a);
		
		
	}

}
