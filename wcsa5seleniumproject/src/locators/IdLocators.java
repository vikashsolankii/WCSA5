package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IdLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("9167533609");
		driver.findElement(By.id("id_password")).sendKeys("May2021");
		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();

	}

}
