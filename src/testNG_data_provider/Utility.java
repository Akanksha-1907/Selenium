package testNG_data_provider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility 
{
	static XSSFWorkbook b;
	static XSSFSheet st;

	public static Object[][] d(String Sheet) throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\data-provider.xlsx");

		b = new XSSFWorkbook(f);

		st = b.getSheet(Sheet);

		int rs = st.getLastRowNum() + 1;

		int cs = st.getRow(0).getLastCellNum();

		Object data[][] = new Object[rs][cs];  //will store in the form of matrix

		for (int i = 0; i < rs; i++) 
		{

			for (int j = 0; j < cs; j++) 
			{
				data[i][j] = st.getRow(i).getCell(j).getStringCellValue();

			}
		}

		return data;

	}

}
