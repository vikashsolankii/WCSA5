package readexceldata;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;import java.io.FileInputStream;
import java.io.IOException;


public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// read data From IPL sheet	
		// Implementation of read the data from excel
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx.xlsx");
		//make the file for ready to meet
		Workbook wbf = WorkbookFactory.create(fis);
		//get into the sheet
		Sheet sheet = wbf.getSheet("IPL");
		 for(int i=1; i<11; i++) {
			//get into the desired row
			    Row row = sheet.getRow(i);
			  //get into the desired cell or column
			    Cell cell = row.getCell(1);
				String value = cell.getStringCellValue();
				System.out.println(value);
		 }
		 
		 
		}

	}



