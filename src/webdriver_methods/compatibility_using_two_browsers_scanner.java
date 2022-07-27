package webdriver_methods;

import java.util.Scanner;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class compatibility_using_two_browsers_scanner
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", " C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\edgedriver_win64\\msedgedriver.exe");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter chrome for chromebrowser and enter edge for edgebrowser");
		String browsername=s.nextLine();
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.google.co.in/");
		String t=driver.getTitle();
		System.out.println(t);
		if(t.equalsIgnoreCase("google"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		Thread.sleep(2000);
		Dimension d=new Dimension(700,700);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.close();
	}
	}


