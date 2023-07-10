package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clearMethod {

	public static void main(String[] args) {
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
	    WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    usn.clear();
	    WebElement pwd= driver.findElement(By.cssSelector("input[name='password']"));
	    pwd.sendKeys("helloBye");
	    pwd.clear();

	}

}
