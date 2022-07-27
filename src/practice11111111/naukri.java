package practice11111111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[text()=\"Remote\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[text()=\"MNC\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//img[@src=\"https://static.naukimg.com/s/0/0/i/trending-naukri/fortune-500.svg\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()=\"Engineering\"]")).click();
//		Thread.sleep(2000);
//		driver.close();

		
		//img[@src="https://images-static.nykaa.com/uploads/69be40a1-ba6f-48e6-abd4-ea7f033e204f.gif?tr=w-1200,cm-pad_resize"]
		
		driver.findElement(By.xpath("//img[@src=\"https://images-static.nykaa.com/uploads/69be40a1-ba6f-48e6-abd4-ea7f033e204f.gif?tr=w-1200,cm-pad_resize\"]")).click();
		Thread.sleep(5000);
		driver.close();
}		
}
