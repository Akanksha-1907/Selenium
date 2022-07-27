package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fetch_data_from_excel_sheet_boolean 
{
	public static void main(String[] args) throws IOException
	{
		//Step 3: Create a new object of FileInputStream Class. Provide the path of excel sheet as an argument to constructor of this class. 
		FileInputStream file=new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\demo_parameterization.xlsx");
		
		//Step4: create new object of XSSFWorkbook and provide above file variable as input. 
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		//Step 5: To navigate on particular sheet use method get sheet(“Sheet Name”). 
		XSSFSheet sheet=book.getSheet("Sheet3");
		
		boolean value=sheet.getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(value);
				
		
	}

}
