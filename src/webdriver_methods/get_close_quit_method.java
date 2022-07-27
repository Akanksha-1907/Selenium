package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_close_quit_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Below two are the mandatory statements
		//to set path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//get();
		
		driver.get("https://web.whatsapp.com/");   //opens the tab.
		
		//close();
		
		Thread.sleep(3000);
		driver.close();      //close the automated tab.
		
		//quit();
		
		driver.quit();    //close the whole page.
		
	}

}
