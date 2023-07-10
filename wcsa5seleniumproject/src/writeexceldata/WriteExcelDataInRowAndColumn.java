package writeexceldata;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteExcelDataInRowAndColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("IPL");
			Row row = sheet.createRow(11);
			Cell cell = row.createCell(0);
		    cell.setCellValue("Mumbai");
		    FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx.xlsx");
		    workbook.write(fos);

			}

	}


