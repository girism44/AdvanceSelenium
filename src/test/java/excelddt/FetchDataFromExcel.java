package excelddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata.xlsx");
		
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		
		Row row = sheet.getRow(2);
		
	
		Cell cell1 = row.getCell(0);
		Cell cell2 = row.getCell(1);
		
	
		String un = cell1.getStringCellValue();
		double pwd = cell2.getNumericCellValue();
		
		System.out.println(un);
		System.out.println(pwd);
		
		wb.close();

	}

}