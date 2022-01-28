package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/***
 * 
 * @author sandeepky
 *
 */
public class ToReadTheDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./TestResources/Testdata.xlsx");		
		Workbook work = WorkbookFactory.create(file);
		String word = work.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(word);
		
		
		
		
	}

}
