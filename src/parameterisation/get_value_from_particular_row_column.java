package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.sdk.logs.data.Body.Type;

public class get_value_from_particular_row_column 

{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\demo_parameterization.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet s=book.getSheet("Sheet4");
		CellType cell=s.getRow(0).getCell(1).getCellType();
		System.out.println(cell);
		
		if(cell==CellType.STRING)
		{
			String s1=s.getRow(0).getCell(3).getStringCellValue();
			System.out.println(s1);
		}
		else if(cell==CellType.NUMERIC)
		{
			double d=s.getRow(3).getCell(1).getNumericCellValue();
			System.out.println(d);
		}
		else
		{
			boolean b=s.getRow(1).getCell(4).getBooleanCellValue();
			System.out.println(b);
			
		}

	}

}
