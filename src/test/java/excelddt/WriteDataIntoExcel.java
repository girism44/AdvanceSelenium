package excelddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//write data in to excel file
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row=sheet.createRow(7);
		Cell cell=row.createCell(0);
		cell.setCellValue("cccccccccc");
		Cell cell1 =row.createCell(1);
		cell1.setCellValue("656565656565561");
		 FileOutputStream fos = new FileOutputStream("./src/test/resources/Testdata.xlsx");
		 wb.write(fos);
		 //Display the written data 
		 FileInputStream fis1 = new FileInputStream("./src/test/resources/Testdata.xlsx");
		 Workbook wb1=WorkbookFactory.create(fis1);
		 Sheet sheet1=wb.getSheet("Sheet1");
		 String un=wb.getSheet("Sheet1").getRow(7).getCell(0).getStringCellValue();

		 System.out.println(un);
		
		
		
		
		
		wb.close();

	}

}
