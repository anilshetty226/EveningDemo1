package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Step1: Specify the path of excel.
		FileInputStream fis=new FileInputStream("./excel/Trial.xlsx");
		
		//step2: open excel
		Workbook book = WorkbookFactory.create(fis);
		
		//Step3: specify the sheet name
		Sheet s = book.getSheet("Sheet1");
		
		//Step4: Specify the row number
		Row r = s.getRow(0);
		
		//Step5: Specify the cell number
		Cell c = r.getCell(0);
		
		//Step6: fetch data
	 	String val = c.getStringCellValue();
	 	System.out.println(val);

	}
}

