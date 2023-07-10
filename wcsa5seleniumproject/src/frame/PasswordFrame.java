package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordFrame {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("file:///C:/Users/shell/Desktop/QUERRY%20BACKUP/loginFrm.html");
	WebElement usn = driver.findElement(By.xpath("//input[@id='i2']"));
	usn.sendKeys("Admin");
	WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='FrameId']"));
	//switching the control to frame
	driver.switchTo().frame(frameElement);
	WebElement pwd = driver.findElement(By.xpath("//input[@id='i1']"));
	pwd.sendKeys("Manager");
	//switching to mainWebPage
	driver.switchTo().defaultContent();
	usn.clear();
	//switching to frame
	driver.switchTo().frame(frameElement);
	pwd.clear();
	
	}

}
