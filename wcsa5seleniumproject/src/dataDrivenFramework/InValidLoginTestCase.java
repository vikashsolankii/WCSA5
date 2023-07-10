package dataDrivenFramework;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-hclttg9/login.do");
		
		//read the data from excel file and test the login page
		Flib flib=new Flib();
		//String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx","valid", 1, 0);
		//String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx","valid", 1, 1);
		int rc = flib.getLastRowCount("./data/ActiTimeTestData.xlsx.xlsx","invalid");
		
		for(int i=1; i<rc;i++) {
	    // Without storing the data....passing in sendkeys
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx","invalid", i, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx","invalid", i, 1));
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
		//writing data in excel sheet
		flib.writeExcelData("./data/ActiTimeTestData.xlsx.xlsx","invalid",4,1);

	}
	}

}
