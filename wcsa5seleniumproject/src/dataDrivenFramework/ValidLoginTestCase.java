package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-hclttg9/login.do");
		
		//read the data from excel file and test the login page
		Flib flib=new Flib();
		//String validUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx","valid", 1, 0);
		//String validPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx","valid", 1, 1);
		
		
	    // Without storing the data....passing in sendkeys
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx","valid", 1, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx","valid", 1, 1));
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}
