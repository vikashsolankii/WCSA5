package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
	   drive();
	}
	public static void drive() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement s1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement t1 = driver.findElement(By.xpath("//ol[@id='loan']/descendant::li"));
		WebElement s2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement t2 = driver.findElement(By.xpath("//ol[@id='amt8']/descendant::li"));
		WebElement s3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement t3 = driver.findElement(By.xpath("//ol[@id='bank']/descendant::li"));
		WebElement s4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement t4 = driver.findElement(By.xpath("//ol[@id='amt7']//descendant::li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(s1, t1).perform();
		act.dragAndDrop(s2, t2).perform();
		act.dragAndDrop(s3, t3).perform();
		act.dragAndDrop(s4, t4).perform();
		if(driver.findElement(By.xpath("//a[text()='Perfect!']")).isDisplayed())
		{
			System.out.println("Executed Successfully");
		}
		else {
			System.out.println("Exception");
		}
	}
}
