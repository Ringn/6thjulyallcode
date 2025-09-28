package pom_Base_Utility_Classess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class 
{
	public static String ExcelData(int row,int col) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\auto.xlsx");
	
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sheet.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	
	public static void SS(WebDriver driver, int tcid) throws IOException 
	{
		TakesScreenshot ss = ((TakesScreenshot)driver);
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Pratiksha\\Documents\\screenshot"+tcid+".jpeg");
		FileHandler.copy(src, dest);
	}

}
