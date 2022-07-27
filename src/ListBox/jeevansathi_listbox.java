package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jeevansathi_listbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jeevansathi.com/search/AdvancedSearch");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=\"Religion\"]/following::input[1]")).click();
		Thread.sleep(2000);
		
		//Choose the Religion
		List<WebElement> we=driver.findElements(By.xpath("//label[text()=\"Religion\"]/following::ul[2]/li"));
		Thread.sleep(2000);
		String exp="Hindu";
		
		for( WebElement o:we)
		{
			System.out.println(o.getText());
			String act=o.getText();
			if(exp.equalsIgnoreCase(act)) 
			{
				o.click();
				break;
			}
			
	}
		Thread.sleep(2000);
		
		//Choose Caste 
		List<WebElement>we2=driver.findElements(By.xpath("(//label[text()=\"Caste\"])[1]/following::input[1]"));
		Thread.sleep(2000);
		
		String exp2="Kunbi";
		for(WebElement o2:we2)
		{
			System.out.println(o2.getText());
			String act2=o2.getText();
			if(exp2.equalsIgnoreCase(act2)) 
			{
				o2.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		//Choose the Mother Tongue from the list
		List<WebElement>we1=driver.findElements(By.xpath("//label[text()=\"Mother Tongue\"]/following::div[3]//li"));
		Thread.sleep(2000);
		String exp1="Marathi";
		for(WebElement o1:we1)
		{
			String act1=o1.getText();
			if(exp1.equalsIgnoreCase(act1))
			{
				o1.click();
				break;
			}
		}
	}
}


