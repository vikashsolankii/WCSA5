import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/mobile-accessories/karwan/karwan-anti-scratch-compatible-iphone-14-plus-back-case/23062006/buy");
		WebElement price = driver.findElement(By.xpath("//span[@class='pdp-price']/."));
		System.out.println(price.getText());
		WebElement text = driver.findElement(By.xpath("//h1[text()='Karwan']"));
		System.out.println(text.getText());
		Set<String> parent = driver.getWindowHandles();
		Iterator<String> it = parent.iterator();
		String frst = it.next();
		String scnd = it.next();
		driver.switchTo().window(scnd);
        
	}

}
