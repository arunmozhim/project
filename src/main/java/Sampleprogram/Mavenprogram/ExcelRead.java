package Sampleprogram.Mavenprogram;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class ExcelRead {
//String filepath1="C:\\Users\\Hp\\eclipse-workspace\\Add\\Mavenprogram\\src\\main\\java\\input\\SampleExcel.xlsx";
String filepath=System.getProperty("D:\\input\\SampleExcel1.xlsx");
public void ReadData() throws IOException
{
	File F = new File(filepath);
	FileInputStream FS = new FileInputStream(F);
	
	//XSSFWorkbook workbook = new XSSFWorkbook(FS);
	
	HSSFWorkbook workbook = new HSSFWorkbook(FS);
	Sheet sheet = workbook.getSheet("name");
	
	int totalRows = sheet.getPhysicalNumberOfRows();
	for (int i=0;i<totalRows;i++)
	{
		Row inputRow = sheet.getRow(i);
		int totalColumn= inputRow.getLastCellNum();
		for(int j=0;j<totalColumn;j++)
		{
			Cell cellValue = inputRow.getCell(j);
			String actualValue = cellValue.getStringCellValue();
			System.out.print(actualValue);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
public static void main(String[] args)throws IOException 

{
		
		ExcelRead E = new ExcelRead();
		E.ReadData();
	}
}


