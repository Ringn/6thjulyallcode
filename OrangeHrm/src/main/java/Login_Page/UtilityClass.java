package Login_Page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public static String excel(int rowindex,int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Downloads\\Excel2.xlsx");
		Workbook book = WorkbookFactory.create(file);
		String value = book.getSheet("Sheet1").getRow(rowindex).getCell(colindex).getStringCellValue();
		return value;
		
	}

}
