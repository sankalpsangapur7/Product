package testNG_ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchExcelData {
	public static void readExcel() throws EncryptedDocumentException, IOException{
		File file=new File("./Testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		book.getSheet("Sheet1").getRow(0).toString();
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		fetchExcelData.readExcel();
	}

}
