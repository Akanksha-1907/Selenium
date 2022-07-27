package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class to_get_cell_type
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\demo_parameterization.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet4");
		
		//getCellType--->get particular CellType
		CellType s=sheet.getRow(2).getCell(8).getCellType();
		System.out.println(s);
		
		System.out.println(sheet.getRow(0).getCell(5).getCellType());
		
		System.out.println(sheet.getRow(2).getCell(1).getCellType());
		
	}

}
