package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/");
			String url=driver.getCurrentUrl();
			System.out.println(url);
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("helloinsta");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("helloBye");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='ap']")).click();
		Thread.sleep(6000);
		driver.close();
		

	}

}
