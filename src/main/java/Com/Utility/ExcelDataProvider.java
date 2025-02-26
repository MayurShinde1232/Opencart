package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook wb;
	
	public ExcelDataProvider() throws IOException
	{
		String FilePath= System.getProperty("user.dir")+"\\Test_Data\\Data.xlsx";
		FileInputStream fis= new FileInputStream(FilePath);
		 wb= new XSSFWorkbook(fis);
		 
	}
	
	public  String getSheet_Data(String SheetName,int Row, int Cell )
	{ 
		try {
		return wb.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return SheetName;
	}

}
