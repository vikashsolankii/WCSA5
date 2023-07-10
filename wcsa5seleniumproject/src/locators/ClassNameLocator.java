package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/ncr/golf-course-order-online");
		driver.switchTo().activeElement().sendKeys("cricket ipl",Keys.ENTER);
		driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
	}

}
