package popuphandelling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import graphql.relay.Edge;

public class NotificationPopup {

	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String bValue = sc.next();
		if(bValue.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/?utm_campaign=14425253924&utm_source=g_c&utm_medium=cpc&utm_term=e_easymytrip&adgroupid=128139253122&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJvzcMB6VpL2ejNWnt2uwQZuZxJHmDr2SnGnterWrBfX3wScX1vHCOkaAk7gEALw_wcB");

	}
		else if(bValue.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				FirefoxOptions fo = new FirefoxOptions();
				fo.addArguments("--disable-notifications");
				WebDriver driver= new FirefoxDriver(fo);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.easemytrip.com/?utm_campaign=14425253924&utm_source=g_c&utm_medium=cpc&utm_term=e_easymytrip&adgroupid=128139253122&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJvzcMB6VpL2ejNWnt2uwQZuZxJHmDr2SnGnterWrBfX3wScX1vHCOkaAk7gEALw_wcB");

			}
		else if(bValue.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notifications");
			WebDriver driver= new EdgeDriver(eo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/?utm_campaign=14425253924&utm_source=g_c&utm_medium=cpc&utm_term=e_easymytrip&adgroupid=128139253122&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJvzcMB6VpL2ejNWnt2uwQZuZxJHmDr2SnGnterWrBfX3wScX1vHCOkaAk7gEALw_wcB");
			

		}
		sc.close();
	}

}
