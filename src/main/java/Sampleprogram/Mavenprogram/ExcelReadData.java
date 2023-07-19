package Sampleprogram.Mavenprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Hp\\eclipse-workspace\\Add\\Mavenprogram\\src\\main\\java\\Sampleprogram\\Mavenprogram\\TestData.xls");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet0=wb.getSheetAt(0);
		Row row0=sheet0.getRow(0);
		Cell cell0=row0.getCell(0);
		
		System.out.println(cell0);
			fis.close();
	}

}
