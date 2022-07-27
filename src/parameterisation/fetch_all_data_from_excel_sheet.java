package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fetch_all_data_from_excel_sheet 
{
	public static void main(String[] args) throws IOException 
	{
		//Step 3: Create a new object of FileInputStream Class. Provide the path of excel sheet as an argument to constructor of this class. 
		FileInputStream file=new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\demo_parameterization.xlsx");
		
		//Step4: create new object of XSSFWorkbook and provide above file variable as input. 
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		//Step 5: To navigate on particular sheet use method get sheet(“Sheet Name”). 
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		//getLastRowNum()-> index of last row in sheet 
		//for no. of rows-> getLastRowNum()+1
		int rowsize=sheet.getLastRowNum()+1;
		System.out.println(rowsize);
		
		//getLastCellNum->no. of columns present in sheet
		int colsize=sheet.getRow(0).getLastCellNum();
		System.out.println(colsize);
		
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
			{
				String str=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(str+" ");
			}
			System.out.println();
		}

		
	}

}
