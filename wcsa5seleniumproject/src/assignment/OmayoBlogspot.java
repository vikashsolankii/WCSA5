package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogspot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='q' and (@class='gsc-input')]")).sendKeys("DhumKetu123",Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='radio1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='rotb']")).sendKeys("hello");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"textboxn\"]")).sendKeys("okay");
        
        	
	}

}
