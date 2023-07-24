package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

//"E:\1.2.gitRepo\webPageAuto\src\test\resources\DataForSelenium.xlsx"
	
	public static String sheetData_workbook (String sheetName,int rowNo,int cellNo) {
		
		String filePath= System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"DataForSelenium.xlsx";
	
		FileInputStream file = null;
		try 
		{
			file = new FileInputStream(filePath);
		} 
		catch (FileNotFoundException e1) 
		{
			System.out.println("failed to get data as file not found...FileNotFoundException...parametrization");
			e1.printStackTrace();
		}
		
		String fileData = null;
		try 
		{
			 fileData=WorkbookFactory.create(file).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		} 
		catch (EncryptedDocumentException e) 
		{
			System.out.println("failed to get data as file is encrypted...EncryptedDocumentException...parametrization");
			e.printStackTrace();
		} catch (IOException e) 
		{
			System.out.println("failed to get data...IOException...parametrization");
			e.printStackTrace();
		}
		 
		return fileData;
		
		
	}
}
