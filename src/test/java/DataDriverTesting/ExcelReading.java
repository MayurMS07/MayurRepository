package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
	@Test
	public void getSheetDetails() throws IOException {
		FileInputStream fis = new FileInputStream("‪E:\\Demo.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Workbook workbook = new XSSFWorkbook(fis);
//		Get the number of worksheets in the this workbook
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("Sheet Count : " + sheetCount);
		System.out.println("Active sheet index : " + workbook.getActiveSheetIndex());
		for (int i = 0; i < sheetCount; i++) {
			System.out.println(workbook.getSheetName(i));
		}
		workbook.close();
	}
	
	@Test
	public void rowOperations() throws IOException {
		FileInputStream fis = new FileInputStream("‪E:\\Demo.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheetAt(0);
		Sheet sheet = workbook.getSheetAt(0);
//		XSSFSheet sheet = workbook.getSheet("sheetname");
		int rowCount = sheet.getLastRowNum(); // row index starts from 0, row number starts from 0
		System.out.println("Row count : " + rowCount);
		workbook.close();
	}

	@Test
	public void cellOperations() throws IOException {
		DataFormatter formatter = new DataFormatter();
		FileInputStream fis = new FileInputStream("‪E:\\Demo.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("LoginData");
//		XSSFRow row = sheet.getRow(0);
		Row row = sheet.getRow(0);
		System.out.println("Cell count in 0th row : " + row.getLastCellNum()); // cell index starts from 0, cell numbers
																				// starts from 1
//		for (int i = 0; i < row.getLastCellNum(); i++) {
//			System.out.print(row.getCell(i).getStringCellValue() + "\t");
//		}
		System.out.println();
//		for (int j = 0; j <= sheet.getLastRowNum(); j++) {
//			for (int i = 0; i < sheet.getRow(j).getLastCellNum(); i++) {
//				System.out.print(sheet.getRow(j).getCell(i).getStringCellValue() + "\t");
//			}
//			System.out.println();
//		}

		for (int j = 0; j <= sheet.getLastRowNum(); j++) {
			for (int i = 0; i < sheet.getRow(j).getLastCellNum(); i++) {
				System.out.print(formatter.formatCellValue(sheet.getRow(j).getCell(i)) + "\t");
			}
			System.out.println();
		}
		workbook.close();
	}

	@Test
	public void excelWriting() throws IOException {
//		file in which we are writing it should not be opened
		FileInputStream fis = new FileInputStream("‪E:\\Demo.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("LoginData");
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			int lastCellCount = row.getLastCellNum();
			row.createCell(lastCellCount).setCellValue("Pass");
		}
		FileOutputStream fos = new FileOutputStream("‪E:\\Demo.xlsx");
		workbook.write(fos);
		fos.flush();
		fos.close();
		workbook.close();
	}
}
