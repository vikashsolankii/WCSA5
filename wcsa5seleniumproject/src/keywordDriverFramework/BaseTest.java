package keywordDriverFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant {
	
	static WebDriver driver;
	public void openBrowser() throws IOException {
		Flib flib=new Flib();
		String webBrowser = flib.readPropertyData(prop_Path, "Browser");
		String url = flib.readPropertyData(prop_Path, "Url");
		
		if(webBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty(chrome_Key, chrome_Value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(webBrowser.equalsIgnoreCase("edge")) {
			System.setProperty(edge_Key, edge_Value);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(webBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty(gecko_Key,gecko_Value);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
	}
		
		
		void closeBrowser() {
			driver.quit();
			
		
	}

}
