package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class ByEventFiringWebDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     event();
	}
	public static void event() throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		EventFiringWebDriver evnt = new EventFiringWebDriver(driver);
		File src=evnt.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/selenium.png");
		Files.copy(src, dest);

}
}
