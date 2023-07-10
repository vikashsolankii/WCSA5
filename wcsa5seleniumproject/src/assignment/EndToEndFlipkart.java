package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndFlipkart {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	Set<String> parent = driver.getWindowHandles();
	Iterator it=parent.iterator();
	String parentId = (String) it.next();
	String childId = (String) it.next();
	driver.switchTo().window(childId);
	driver.findElement(By.xpath("//div[text()='Select delivery location']")).click();
	driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("411017");
	driver.findElement(By.xpath("(//span[@class='a-button-inner a-declarative'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    driver.findElement(By.xpath("(//input[@class='a-button-input' and @type='submit' ])[6]")).click();
	driver.findElement(By.xpath("//span[@id='sw-gtc']")).click();
	//driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
	}
	}


