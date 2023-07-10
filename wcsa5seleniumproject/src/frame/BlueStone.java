package frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwnf-kBhCnARIsAFlg492s8lcUbiX-ma_6xpulISFJAbpD0VVSpUR4FMDaFtVYQ1FL92aKLoAaAq9zEALw_wcB");
    driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
    
    //using to avoid confirmation popup
   // Alert al = driver.switchTo().alert();
   //al.accept();
    Thread.sleep(3000);
    
    //identifying fame by id
  //  driver.switchTo().frame("fc_widget");
    
    //identifying by frameElement
    WebElement frm = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
    driver.switchTo().frame(frm);
    exWait(driver, 15);
    driver.findElement(By.id("chat-icon")).click();
    
    //using defaultContent() to switch the control on Main WebPage
   driver.switchTo().defaultContent();
   driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("vikash");
   driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("vikashsolanki488@gmail.com");
   driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("9876543210");
    
	}
	public static void exWait(WebDriver driver,int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("chat-icon")));
	}

}
