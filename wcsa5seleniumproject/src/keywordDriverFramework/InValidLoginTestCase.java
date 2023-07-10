package keywordDriverFramework;

import java.io.IOException;   

import org.openqa.selenium.By;

public class InValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		int lastRc = bt.getLastRowCount(excel_Path,"invalid");
		for(int i=1; i<lastRc;i++) {
			driver.findElement(By.name("username")).sendKeys(bt.readExcelData(excel_Path, "invalid", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(bt.readExcelData(excel_Path, "invalid", i, 1));
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}


	}

}
