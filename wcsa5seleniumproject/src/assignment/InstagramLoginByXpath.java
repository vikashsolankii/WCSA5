package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginByXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("helloinsta");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hellobye123");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		

	}

}
