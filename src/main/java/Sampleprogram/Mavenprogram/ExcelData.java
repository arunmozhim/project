package Sampleprogram.Mavenprogram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet sheet=workbook.createSheet();
Row r0=sheet.createRow(0);
Cell c0=r0.createCell(0);
c0.setCellValue("BESANT TECHNOLOGY");
File f=new File("C:\\Users\\Hp\\eclipse-workspace\\Add\\Mavenprogram\\src\\main\\java\\Sampleprogram\\Mavenprogram\\TestData.xls");
FileOutputStream fos=new FileOutputStream(f);
workbook.write(fos);;
fos.close();
workbook.close();
System.out.println("file is written successfully!");

	
	}

	}

