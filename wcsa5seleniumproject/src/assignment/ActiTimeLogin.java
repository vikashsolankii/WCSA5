package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-hclttg9/login.do");
		driver.findElement(By.className("textField")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("http://desktop-hclttg9/tasks/otasklist.do")).click();
		
		//driver.close();

	}

}
