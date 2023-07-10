package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement usn=driver.findElement(By.cssSelector("input[name$='name']"));
	    usn.sendKeys("helloinsta");
	   // WebElement pwd= driver.findElement(By.cssSelector("input[name='password']"));
	   // pwd.sendKeys("helloBye");
	    //WebElement btn =driver.findElement(By.cssSelector("button[class*='ap']"));
	    Thread.sleep(3000);
	    usn.clear();
	   // pwd.clear();
	    
	    
	}

}
