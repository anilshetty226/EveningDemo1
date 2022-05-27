package selenium;

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

public class SingleWrite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Step1: Specify the path of excel
		FileInputStream fis = new FileInputStream("./excel/Trial.xlsx");
		//Step2: open excel
		Workbook book = WorkbookFactory.create(fis);
		//Step3: Specify the sheet name
		Sheet s = book.getSheet("Sheet1");
		//Step4: Specify the row number
		Row r = s.createRow(0);
		//Step5: Specify the cell number
		Cell c = r.createCell(1);
		//Step6: Write the data
		c.setCellValue("hello");
		FileOutputStream fout = new FileOutputStream("./excel/Trial.xlsx");
		book.write( fout);

	}

}
