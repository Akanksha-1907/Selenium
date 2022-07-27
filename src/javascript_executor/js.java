package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js {
	public static void main(String[] a) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.twoplugs.com/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//WebElement el = driver.findElement(By.xpath("(//span[text()=\"Join now for free\"])[1]"));
		WebElement login=driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		//js.m2(el, driver);
	    m2(login, driver);
	}

	public static void m2(WebElement ell, WebDriver driver) throws InterruptedException {

		String s = ell.getCssValue("backgroundColor");
		for (int i = 0; i < 400; i++) {
			cc("#000000", ell, driver);
			cc(s, ell, driver);
		}
	}

	public static void cc(String ss, WebElement ell, WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background ='" + ss + "'", ell);
		// Thread.sleep(2000);
	}
}
