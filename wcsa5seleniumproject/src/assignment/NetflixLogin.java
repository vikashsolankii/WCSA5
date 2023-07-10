package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.cssSelector("input[name='userLoginId']")).sendKeys("9167533609");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("May2021");
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Divya']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='color-primary hasLabel hasIcon ltr-ed00td']")).click();
	}

}
