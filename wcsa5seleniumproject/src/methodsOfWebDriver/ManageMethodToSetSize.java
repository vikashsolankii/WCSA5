package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to set The Size
		Dimension size=new Dimension(5000, 4000);
		//To Open the URL
		driver.get("https://youtube.com/");
		// To get the Current URL
		String getUrl=driver.getCurrentUrl();
		System.out.println(getUrl);
		// To get the Title of Current URL
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		driver.manage().window().setSize(size);

	}

}
