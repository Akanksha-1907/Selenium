package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_method
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//getTitle();
		
		driver.get("https://www.youtube.com/");
		String title=driver.getTitle();
	    System.out.println(title);
	    
	    //test Case 1-->Verify that the user navigated to the correct webpage.
	    if(title.equalsIgnoreCase("Youtube"))
	    		{
	    	System.out.println("Test Case is Passed");
	    		}
	    else
	           {
	    	System.out.println("Test Case is Failed");
	    	
	           }
	    Thread.sleep(2000);
		driver.close();
	}

}
