package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

		    String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			Cell cell = row.getCell(cellCount);
			String data = cell.getStringCellValue();
			return data;
		
		}
		    
		   //it is use to get last count of row where we store data
           int getLastRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException {
        	FileInputStream fis = new FileInputStream(excelpath);
        	Workbook wb=WorkbookFactory.create(fis);
        	Sheet sheet = wb.getSheet(sheetName);
        	int last = sheet.getLastRowNum();
        	return last;
           }
           
           //it is use to write the data in excel sheet
           void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
        	  FileInputStream fis = new FileInputStream(excelPath);//providing the path
        	  Workbook wb = WorkbookFactory.create(fis);
        	  Sheet sheet = wb.getSheet(sheetName);//getting the sheet
        	 Row row=sheet.createRow(rowCount);
        	 Cell cell=row.createCell(cellCount);
        	 cell.setCellValue("admin11");
        	FileOutputStream fos = new FileOutputStream(excelPath);
        	wb.write(fos);
        	 
           }

}