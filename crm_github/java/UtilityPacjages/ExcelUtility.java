package UtilityPacjages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String readDataFromExcel(String sheetname, int rownum, int colnum) throws Throwable, IOException
	{
		FileInputStream xfis=new FileInputStream("./src/test/resources/aa.xlsx");
		Workbook WorkBook = WorkbookFactory.create(xfis);
		Sheet sheet = WorkBook.getSheet(sheetname);
	     Row row = sheet.getRow(rownum);
	    Cell ce = row.getCell(colnum);
	      DataFormatter formatter=new DataFormatter();
	     String Orgname = formatter.formatCellValue(ce);
	     WorkBook.close();
	     return Orgname;

	}

}
