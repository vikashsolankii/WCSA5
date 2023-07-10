package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		drive();
	}
	public static void drive() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		exTime(driver,15);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hplaptop");
		exTime(driver, 15);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		WebElement target=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions actions=new Actions(driver);
		exTime(driver, 15);
		actions.moveToElement(target).perform();
	}
	public static void exTime(WebDriver driver,int seconds) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
	}

}
