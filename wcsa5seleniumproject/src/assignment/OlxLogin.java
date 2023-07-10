package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlxLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.olx.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Login with Email']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email_input_field']")).sendKeys("vikashsolanki488@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='_1nc4-']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("Continue with Phone")).click();
        
	}

}
