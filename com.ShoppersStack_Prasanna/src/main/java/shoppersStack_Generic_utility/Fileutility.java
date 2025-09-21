package shoppersStack_Generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fileutility {
	
	public String loaddatafromPropertyfile(String Key) throws IOException {
		
		FileInputStream fis=new FileInputStream(Framework_Constants.propertypath);
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(Key);
		return value;
	}
	
	public String loaddatafromExcelfile(String Sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Framework_Constants.Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		String value=wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;	
	}
	

}
