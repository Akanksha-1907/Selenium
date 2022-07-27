package POM_DDF_testNG_with_mandatory_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//Utility Class has the methods for fetching data from Excel,Screenshot
	public static String Fetchdata(int rowIndex,int cellIndex) throws IOException 
	{
	//open excel sheet to fetch the data
			FileInputStream file =new FileInputStream("C:\\Users\\Windows\\Desktop\\Automation\\java\\Selenium_Automation\\excelsheet_data\\Framework_BDD.xlsx");
			XSSFWorkbook book=new XSSFWorkbook(file);
			XSSFSheet sh=book.getSheet("Sheet2");
			String data=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
			return data;
}
	public static void screenshot(WebDriver driver,String file) throws IOException
	{
		TakesScreenshot s=(TakesScreenshot)driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Windows\\Desktop\\Automation\\java\\Selenium_Automation\\screenshots"+file+".jpg");
		FileHandler.copy(src, dest);
	}
}