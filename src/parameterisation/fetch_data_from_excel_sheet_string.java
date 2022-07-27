package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fetch_data_from_excel_sheet_string
{
	public static void main(String[] args) throws IOException
	{
		//Step 3: Create a new object of FileInputStream Class. Provide the path of excel sheet as an argument to constructor of this class. 
		FileInputStream file=new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\demo_parameterization.xlsx");
		
		//Step4: create new object of XSSFWorkbook and provide above file variable as input. 
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		//Step 5: To navigate on particular sheet use method get sheet(“Sheet Name”). 
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		//Step 6: to go to particular row use method getRow(int value).
		XSSFRow row=sheet.getRow(0);
		
		//Step 7: To go to particular column use method getCell(int value).
		XSSFCell col=row.getCell(0);
		
		//Step 8: To get string value present in sheet use method getStringCellValue(). 
		String s=col.getStringCellValue();
		System.out.println(s);


		
	}

}
