package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.google.common.io.Files;
public class ByRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		remote();
	}
	public static void remote() throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		RemoteWebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petstore.swagger.io/#/pet/updatePet");
		File src= driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/pet.png");
		Files.copy(src, dest);
}
}