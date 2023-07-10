package keywordDriverFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
	Flib flib=new Flib();	
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	
	driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(prop_Path,Key_Username));
	driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(prop_Path,Key_Password));
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	bt.closeBrowser();
	

	}

}
