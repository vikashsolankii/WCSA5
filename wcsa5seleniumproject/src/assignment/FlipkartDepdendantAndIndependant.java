package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//applying explicit wait by creating Method exWait
public class FlipkartDepdendantAndIndependant {
	public static void exWait(WebDriver driver,int sec) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));	
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        //applying implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //Thread.sleep(8000);
        exWait(driver,10);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hp Laptops");
       // Thread.sleep(2000);
        exWait(driver,10);
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        //Thread.sleep(4000);
        exWait(driver,10);
        driver.findElement(By.xpath("//div[@class='_24_Dny']/..//div[text()='Core i5']")).click();
        //Thread.sleep(3000);
        exWait(driver,10);
        driver.findElement(By.xpath("//div[text()='Processor Brand']")).click();
        driver.findElement(By.xpath("//div[text()='Intel']")).click();
       // Thread.sleep(4000);
        exWait(driver,10);
        driver.findElement(By.xpath("//div[contains(text(),'HP Victus Core i5 11th Gen - (8 GB/512 ')]/../..//div[text()='₹58,990']")).click();
       // Thread.sleep(3000);
        exWait(driver,10);
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();;
        
       

	}

}
