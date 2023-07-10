package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://omayo.blogspot.com/");
			String urlName=driver.getCurrentUrl();
			System.out.println(urlName);
			driver.manage().window().maximize();
			Dimension dimension= new Dimension(4000, 5000);
			Thread.sleep(4000);
			driver.navigate().back();
			driver.close();
			

	}

}
