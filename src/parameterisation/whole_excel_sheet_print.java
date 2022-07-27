package parameterisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class whole_excel_sheet_print 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\demo_parameterization.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet4");
		
		int rowsize=sheet.getLastRowNum()+1;
		int cellsize=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<cellsize;j++)
			{
				CellType cell=sheet.getRow(i).getCell(j).getCellType();
				if(cell==CellType.STRING)
				{
					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"    ");
				}
				else if(cell==CellType.NUMERIC)
				{
					System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue()+"    ");
				}
				else
				{
					System.out.print(sheet.getRow(i).getCell(j).getBooleanCellValue()+"    ");
				}
			}
			System.out.println();
		}
		
	}

}
